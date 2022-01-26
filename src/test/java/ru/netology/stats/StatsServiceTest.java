package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();
        int[] salesMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calcSum(salesMonths);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAvr() {
        StatsService service = new StatsService();
        int[] salesMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAvr(salesMonths);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() {
        StatsService service = new StatsService();
        int[] salesMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMax(salesMonths);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMin() {
        StatsService service = new StatsService();
        int[] salesMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMin(salesMonths);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberMin() {
        StatsService service = new StatsService();
        int[] salesMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberMin(salesMonths);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberMax() {
        StatsService service = new StatsService();
        int[] salesMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.numberMax(salesMonths);
        assertEquals(expected, actual);
    }
}