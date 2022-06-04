package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    int[] salesPerMonth = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };

    @Test
    public void testAmountAllMonth() {
        StatsService amount = new StatsService();
        int actual = amount.amountAllMonth(salesPerMonth);
        int expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAvgMonth() {
        StatsService avg = new StatsService();
        int actual;
        actual = avg.avgMonth(salesPerMonth);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxMonthSales() {
        StatsService maxMonth = new StatsService();
        int actual = (int) maxMonth.maxMonth(salesPerMonth);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinMonthSales() {
        StatsService minMonth = new StatsService();
        int actual = (int) minMonth.minMonth(salesPerMonth);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumMonthBelowAvg() {
        StatsService sumBellow = new StatsService();
        int actual = sumBellow.sumMonthBelowAvg(salesPerMonth);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumMonthAboveAvg() {
        StatsService sumAbove = new StatsService();
        int actual = sumAbove.sumMonthAboveAvg(salesPerMonth);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

}

