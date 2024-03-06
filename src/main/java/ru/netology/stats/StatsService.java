package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        long summ = 0;
        for (int i = 0; i < sales.length; i++) {
            summ = summ + sales[i];
        }
        return (int) summ;
    }

    public int averageSales(long[] sales) {
        long summ = 0;
        for (int i = 0; i < sales.length; i++) {
            summ = summ + sales[i];
        }
        return (int) summ / sales.length;
    }

    public int maxMonthSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
            continue;
        }
        return maxMonth + 1;
    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
            continue;
        }
        return minMonth + 1;
    }

    public int SumUnderAverage(long[] sales) {
        StatsService service = new StatsService();
        int summaAv = service.averageSales(sales);
        long summUnder = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < summaAv) {
                summUnder++;
            }
        }
        return (int) summUnder;
    }

    public int SumOverAverage(long[] sales) {
        StatsService service = new StatsService();
        int summaAv = service.averageSales(sales);
        long summUnder = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > summaAv) {
                summUnder++;
            }
        }
        return (int) summUnder;
    }
}
