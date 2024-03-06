package ru.netology.stats;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAv = 15;
        int actualAv = service.averageSales(sales);
        Assertions.assertEquals(expectedAv, actualAv);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMax = 8;
        int actualMax = service.maxMonthSales(sales);
        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMin = 9;
        int actualMin = service.minMonthSales(sales);
        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void shouldFindSumUnderAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedEq = 5;
        int actualEq = service.SumUnderAverage(sales);
        Assertions.assertEquals(expectedEq, actualEq);
    }

    @Test
    public void shouldFindSumOverAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedEq = 5;
        int actualEq = service.SumOverAverage(sales);
        Assertions.assertEquals(expectedEq, actualEq);
    }
}

