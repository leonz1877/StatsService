package ru.netology.stats;

public class StatsService {

    public int amountAllMonth(int[] salesPerMonth) {
        int amount = 0;
        for (int m : salesPerMonth) {
            amount += m;
        }
        return amount;
    }

    public int avgMonth(int[] salesPerMonth) {
        int avg = amountAllMonth(salesPerMonth) / salesPerMonth.length;
        return avg;
    }

    public int maxMonth(int[] salesPerMonth) {
        int max = 0;
        int month = 0;
        for (int m : salesPerMonth) {
            if ( m >= salesPerMonth[max]) {
                max = month;
            }
            month = month + 1;
        }

        return max + 1;
    }

    public int minMonth(int[] salesPerMonth) {
        int min = 0;
        for (int i = 0; i < salesPerMonth.length; i++) {
            if (salesPerMonth[i]<=salesPerMonth[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int sumMonthBelowAvg(int[] salesPerMonth) {

        int sumBellow = 0;
        for (int m : salesPerMonth) {
            if (m < avgMonth(salesPerMonth)) {
                sumBellow++;
            }
        }
        return sumBellow;
    }

    public int sumMonthAboveAvg(int[] salesPerMonth) {

        int sumAbove = 0;
        for (int m : salesPerMonth) {
            if (m > avgMonth(salesPerMonth)) {
                sumAbove++;
            }
        }
        return sumAbove;
    }

}
