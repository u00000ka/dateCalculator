package com.u00000ka.tools.Form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public class DateCalculatorForm implements Serializable {

    @NotNull(message = "年は必須です")
    @Min(value = 1900, message = "年は1900年以降を入力してください")
    @Max(value = 2100, message = "年は2100年以前を入力してください")
    private Integer year;

    @NotNull(message = "月は必須です")
    @Min(value = 1, message = "月は1から12の間で入力してください")
    @Max(value = 12, message = "月は1から12の間で入力してください")
    private Integer month;

    @NotNull(message = "日は必須です")
    @Min(value = 1, message = "日は1から31の間で入力してください")
    @Max(value = 31, message = "日は1から31の間で入力してください")
    private Integer day;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
}
