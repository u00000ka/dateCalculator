package com.u00000ka.tools.Controller;

import com.u00000ka.tools.Service.DateService;
import com.u00000ka.tools.ViewModel.DateInformationViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class DateController {

    private final DateService dateService;

    public DateController(DateService dateService) {
        this.dateService = dateService;
    }

    /**
     * 画面初期表示
     * @return date/index.jsp
     */
    @GetMapping(value = "/date", params = {"!year", "!month", "!day"})
    public String index() {
        return "date/index";
    }

    /**
     * 計算結果表示
     * @param year 年
     * @param month 月
     * @param day 日
     * @return date/index.jsp
     */
    @GetMapping(value = "/date", params = {"year", "month", "day"})
    public ModelAndView calculateDateInfo(
            @RequestParam("year") int year,
            @RequestParam("month") int month,
            @RequestParam("day") int day) {

        LocalDate birthDate = LocalDate.of(year, month, day);

        // Serviceからデータを取得
        long daysBetween = dateService.calculateDaysFromDate(birthDate);
        String zodiacSign = dateService.getConstellation(birthDate);
        String chineseZodiac = dateService.getZodiac(birthDate);

        // JSPで使う用
        DateInformationViewModel viewModel = new DateInformationViewModel(birthDate, daysBetween, zodiacSign, chineseZodiac);
        ModelAndView modelAndView = new ModelAndView("date/index");
        modelAndView.addObject("viewModel", viewModel);
        return modelAndView;
    }
}
