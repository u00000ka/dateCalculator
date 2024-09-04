package com.u00000ka.tools.Service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

class DateServiceTest {

    private final DateService dateService = new DateService();

    @Test
    void testCalculateDaysFromDate1() {
        LocalDate pastDate = LocalDate.of(2024, 9, 1);
        LocalDate today = LocalDate.of(2024, 9, 2);
        long days = dateService.calculateDaysFromDate(pastDate, today);
        assertEquals(1, days);
    }

    @Test
    void testCalculateDaysFromDate2() {
        LocalDate pastDate = LocalDate.of(2024, 9, 1);
        LocalDate today = LocalDate.of(2024, 9, 3);
        long days = dateService.calculateDaysFromDate(pastDate, today);
        assertEquals(2, days);
    }

    @Test
    void testCalculateDaysFromDate3() {
        LocalDate pastDate = LocalDate.of(2024, 8, 1);
        LocalDate today = LocalDate.of(2024, 9, 1);
        long days = dateService.calculateDaysFromDate(pastDate, today);
        assertEquals(31, days);
    }

    @Test
    void testGetConstellation() {
        assertEquals("山羊座", dateService.getConstellation(LocalDate.of(2024, 1, 1)));
        assertEquals("山羊座", dateService.getConstellation(LocalDate.of(2024, 1, 19)));

        assertEquals("水瓶座", dateService.getConstellation(LocalDate.of(2024, 1, 20)));
        assertEquals("水瓶座", dateService.getConstellation(LocalDate.of(2024, 1, 31)));
        assertEquals("水瓶座", dateService.getConstellation(LocalDate.of(2024, 2, 1)));
        assertEquals("水瓶座", dateService.getConstellation(LocalDate.of(2024, 2, 18)));

        assertEquals("魚座", dateService.getConstellation(LocalDate.of(2024, 2, 19)));
        assertEquals("魚座", dateService.getConstellation(LocalDate.of(2024, 2, 29)));
        assertEquals("魚座", dateService.getConstellation(LocalDate.of(2024, 3, 1)));
        assertEquals("魚座", dateService.getConstellation(LocalDate.of(2024, 3, 20)));

        assertEquals("牡羊座", dateService.getConstellation(LocalDate.of(2024, 3, 21)));
        assertEquals("牡羊座", dateService.getConstellation(LocalDate.of(2024, 3, 31)));
        assertEquals("牡羊座", dateService.getConstellation(LocalDate.of(2024, 4, 1)));
        assertEquals("牡羊座", dateService.getConstellation(LocalDate.of(2024, 4, 19)));

        assertEquals("牡牛座", dateService.getConstellation(LocalDate.of(2024, 4, 20)));
        assertEquals("牡牛座", dateService.getConstellation(LocalDate.of(2024, 4, 30)));
        assertEquals("牡牛座", dateService.getConstellation(LocalDate.of(2024, 5, 1)));
        assertEquals("牡牛座", dateService.getConstellation(LocalDate.of(2024, 5, 20)));

        assertEquals("双子座", dateService.getConstellation(LocalDate.of(2024, 5, 21)));
        assertEquals("双子座", dateService.getConstellation(LocalDate.of(2024, 5, 31)));
        assertEquals("双子座", dateService.getConstellation(LocalDate.of(2024, 6, 1)));
        assertEquals("双子座", dateService.getConstellation(LocalDate.of(2024, 6, 20)));

        assertEquals("蟹座", dateService.getConstellation(LocalDate.of(2024, 6, 21)));
        assertEquals("蟹座", dateService.getConstellation(LocalDate.of(2024, 6, 30)));
        assertEquals("蟹座", dateService.getConstellation(LocalDate.of(2024, 7, 1)));
        assertEquals("蟹座", dateService.getConstellation(LocalDate.of(2024, 7, 22)));

        assertEquals("獅子座", dateService.getConstellation(LocalDate.of(2024, 7, 23)));
        assertEquals("獅子座", dateService.getConstellation(LocalDate.of(2024, 7, 31)));
        assertEquals("獅子座", dateService.getConstellation(LocalDate.of(2024, 8, 1)));
        assertEquals("獅子座", dateService.getConstellation(LocalDate.of(2024, 8, 22)));

        assertEquals("乙女座", dateService.getConstellation(LocalDate.of(2024, 8, 23)));
        assertEquals("乙女座", dateService.getConstellation(LocalDate.of(2024, 8, 31)));
        assertEquals("乙女座", dateService.getConstellation(LocalDate.of(2024, 9, 1)));
        assertEquals("乙女座", dateService.getConstellation(LocalDate.of(2024, 9, 22)));

        assertEquals("天秤座", dateService.getConstellation(LocalDate.of(2024, 9, 23)));
        assertEquals("天秤座", dateService.getConstellation(LocalDate.of(2024, 9, 30)));
        assertEquals("天秤座", dateService.getConstellation(LocalDate.of(2024, 10, 1)));
        assertEquals("天秤座", dateService.getConstellation(LocalDate.of(2024, 10, 22)));

        assertEquals("蠍座", dateService.getConstellation(LocalDate.of(2024, 10, 23)));
        assertEquals("蠍座", dateService.getConstellation(LocalDate.of(2024, 10, 31)));
        assertEquals("蠍座", dateService.getConstellation(LocalDate.of(2024, 11, 1)));
        assertEquals("蠍座", dateService.getConstellation(LocalDate.of(2024, 11, 21)));

        assertEquals("射手座", dateService.getConstellation(LocalDate.of(2024, 11, 22)));
        assertEquals("射手座", dateService.getConstellation(LocalDate.of(2024, 11, 30)));
        assertEquals("射手座", dateService.getConstellation(LocalDate.of(2024, 12, 1)));
        assertEquals("射手座", dateService.getConstellation(LocalDate.of(2024, 12, 21)));

        assertEquals("山羊座", dateService.getConstellation(LocalDate.of(2024, 12, 22)));
        assertEquals("山羊座", dateService.getConstellation(LocalDate.of(2024, 12, 31)));
    }

    @Test
    void testGetZodiac() {
        assertEquals("子", dateService.getZodiac(LocalDate.of(1900, 1, 1)));
        assertEquals("子", dateService.getZodiac(LocalDate.of(1924, 1, 1)));
        assertEquals("丑", dateService.getZodiac(LocalDate.of(1925, 1, 1)));
        assertEquals("寅", dateService.getZodiac(LocalDate.of(1926, 1, 1)));
        assertEquals("子", dateService.getZodiac(LocalDate.of(1936, 1, 1)));

        assertEquals("子", dateService.getZodiac(LocalDate.of(2008, 1, 1)));
        assertEquals("丑", dateService.getZodiac(LocalDate.of(2009, 1, 1)));
        assertEquals("寅", dateService.getZodiac(LocalDate.of(2010, 1, 1)));
        assertEquals("卯", dateService.getZodiac(LocalDate.of(2011, 1, 1)));
        assertEquals("辰", dateService.getZodiac(LocalDate.of(2012, 1, 1)));
        assertEquals("巳", dateService.getZodiac(LocalDate.of(2013, 1, 1)));
        assertEquals("午", dateService.getZodiac(LocalDate.of(2014, 1, 1)));
        assertEquals("未", dateService.getZodiac(LocalDate.of(2015, 1, 1)));
        assertEquals("申", dateService.getZodiac(LocalDate.of(2016, 1, 1)));
        assertEquals("酉", dateService.getZodiac(LocalDate.of(2017, 1, 1)));
        assertEquals("戌", dateService.getZodiac(LocalDate.of(2018, 1, 1)));
        assertEquals("亥", dateService.getZodiac(LocalDate.of(2019, 1, 1)));
    }
}
