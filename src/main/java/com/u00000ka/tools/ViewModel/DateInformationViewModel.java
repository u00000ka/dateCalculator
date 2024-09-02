package com.u00000ka.tools.ViewModel;

import java.time.LocalDate;

public class DateInformationViewModel {

    /**
     * 生年月日
     */
    private LocalDate birthDate;

    /**
     * 生年月日から今日（システム日付）までの日数
     */
    private long daysFromBirth;

    /**
     * 星座
     */
    private String constellation;

    /**
     * 干支
     */
    private String zodiac;

    public DateInformationViewModel(LocalDate birthDate, long daysFromBirth, String constellation, String zodiac) {
        this.birthDate = birthDate;
        this.daysFromBirth = daysFromBirth;
        this.constellation = constellation;
        this.zodiac = zodiac;
    }
    
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public long getDaysFromBirth() {
        return daysFromBirth;
    }

    public void setDaysFromBirth(long daysFromBirth) {
        this.daysFromBirth = daysFromBirth;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getZodiac() {
        return zodiac;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }
}
