package ru.netology.stats;

public class StatsService {
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int findAvr(int[] sales) {
        return calcSum(sales) / sales.length;
    }

    public int findMax(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int findMin(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int numberMin(int[] sales) {
        int minMonth = 0;
        for (int sale : sales) {
            if (sale < calcSum(sales) / sales.length) {
                minMonth++;
            }
        }
        return minMonth;
    }

    public int numberMax(int[] sales) {
        int maxMonth = 0;
        for (int sale : sales) {
            if (sale > calcSum(sales) / sales.length) {
                maxMonth++;
            }
        }
        return maxMonth;
    }
}