import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {

    @org.junit.jupiter.api.Test
    void shouldSalesAmountForAllYear() {
        Statistics sales = new Statistics();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = sales.calculateSale(sale);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldAverageAmountForAllYear() {
        Statistics averageSales = new Statistics();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = averageSales.averageAmount(sale);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldMonthOfMaxSales() {
        Statistics max = new Statistics();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = max.monthOfMaxSales(sale);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldMonthOfMinimumSales() {
        Statistics minimum = new Statistics();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = minimum.monthOfMinimumSales(sale);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldQuantityMonthOfMaxSales() {
        Statistics maxMonth = new Statistics();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = maxMonth.quantityMonthOfMaxSales(sale);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldQuantityMonthOfMinimumSales() {
        Statistics minMonth = new Statistics();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = minMonth.quantityMonthOfMinimumSales(sale);
        assertEquals(expected, actual);
    }

}