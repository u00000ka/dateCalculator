package com.u00000ka.tools.Service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

@Service
public class DateService {

    /**
     * 干支の配列
     */
    private static final String[] ZODIACS = {
            "子", "丑", "寅", "卯", "辰",
            "巳", "午", "未", "申", "酉",
            "戌", "亥"
    };

    /**
     * 年月日から今日までの日数を計算
     *
     * @param date 年月日
     * @return 指定の年月日から今日までの日数
     */
    public long calculateDaysFromDate(LocalDate date) {
        LocalDate today = LocalDate.now();
        return ChronoUnit.DAYS.between(date, today);
    }

    /**
     * 月日から星座を取得
     * @param date 年月日
     * @return 星座
     */
    public String getConstellation(LocalDate date) {
        Month month = date.getMonth();
        int day = date.getDayOfMonth();

        return switch (month) {
            case JANUARY -> {
                if (day <= 19) yield "山羊座";
                yield "水瓶座";
            }
            case FEBRUARY -> {
                if (day <= 18) yield "水瓶座";
                yield "魚座";
            }
            case MARCH -> {
                if (day <= 20) yield "魚座";
                yield "牡羊座";
            }
            case APRIL -> {
                if (day <= 19) yield "牡羊座";
                yield "牡牛座";
            }
            case MAY -> {
                if (day <= 20) yield "牡牛座";
                yield "双子座";
            }
            case JUNE -> {
                if (day <= 20) yield "双子座";
                yield "蟹座";
            }
            case JULY -> {
                if (day <= 22) yield "蟹座";
                yield "獅子座";
            }
            case AUGUST -> {
                if (day <= 22) yield "獅子座";
                yield "乙女座";
            }
            case SEPTEMBER -> {
                if (day <= 22) yield "乙女座";
                yield "天秤座";
            }
            case OCTOBER -> {
                if (day <= 22) yield "天秤座";
                yield "蠍座";
            }
            case NOVEMBER -> {
                if (day <= 21) yield "蠍座";
                yield "射手座";
            }
            case DECEMBER -> {
                if (day <= 21) yield "射手座";
                yield "山羊座";
            }
            default -> "不明";
        };
    }

    /**
     * 年から干支を取得
     * @param date 年月日
     * @return 干支
     */
    public String getZodiac(LocalDate date) {
        int year = date.getYear();
        // 干支の基準年（子年）
        int baseYear = 1924;
        int cycleYear = year - baseYear;
        int zodiacIndex = cycleYear % 12;
        return ZODIACS[zodiacIndex];
    }
}
