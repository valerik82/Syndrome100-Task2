package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        assertEquals(12, service.findMax(incomesInBillions));

    }

    @Test
    public void testFindMaxReturnsOnlyValue() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {10};
        assertEquals(10, service.findMax(incomesInBillions));
    }

    @Test
    public void testFindMaxReturnsNegativeValue() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {-12, -5, -8, -4, -5, -3, -8, -6, -11, -11, -12};
        assertEquals(-3, service.findMax(incomesInBillions));
    }
}
