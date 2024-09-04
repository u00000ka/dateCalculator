package com.u00000ka.tools.Controller;

import com.u00000ka.tools.Form.DateCalculatorForm;
import com.u00000ka.tools.Service.DateService;
import com.u00000ka.tools.ViewModel.DateCalculatorResultViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.DateTimeException;
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
     * @param form 入力値
     * @param bindingResult バリデーションの結果
     * @return date/index.jsp
     */
    @GetMapping(value = "/date")
    public ModelAndView calculateDateInfo(
            @Validated DateCalculatorForm form,
            BindingResult bindingResult
    ) {

        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("date/index");
            modelAndView.addObject("bindingResult", bindingResult);
            return modelAndView;
        }

        LocalDate birthDate;
        try {
            birthDate = LocalDate.of(form.getYear(), form.getMonth(), form.getDay());
        } catch (DateTimeException e) {
            ModelAndView modelAndView = new ModelAndView("date/index");
            bindingResult.addError(new FieldError("DateCalculatorForm", "day", "無効な日付です。正しい日付を入力してください"));
            modelAndView.addObject("bindingResult", bindingResult);
            return modelAndView;
        }

        // Serviceからデータを取得
        long daysBetween = dateService.calculateDaysFromDate(birthDate, LocalDate.now());
        String zodiacSign = dateService.getConstellation(birthDate);
        String chineseZodiac = dateService.getZodiac(birthDate);

        // JSPで使う用
        DateCalculatorResultViewModel viewModel = new DateCalculatorResultViewModel(birthDate, daysBetween, zodiacSign, chineseZodiac);
        ModelAndView modelAndView = new ModelAndView("date/index");
        modelAndView.addObject("viewModel", viewModel);
        return modelAndView;
    }
}
