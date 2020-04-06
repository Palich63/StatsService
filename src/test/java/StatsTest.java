import ru.netology.stats.Stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsTest {

    @org.junit.jupiter.api.Test
    void shouldSalesAmountForAllYear() {
        Stats sales = new Stats();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = sales.calculateSale(sale);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldAverageAmountForAllYear() {
        Stats averageSales = new Stats();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = averageSales.averageAmount(sale);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldMonthOfMaxSales() {
        Stats max = new Stats();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = max.monthOfMaxSales(sale);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldMonthOfMinimumSales() {
        Stats minimum = new Stats();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = minimum.monthOfMinimumSales(sale);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldQuantityMonthOfMaxSales() {
        Stats maxMonth = new Stats();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = maxMonth.quantityMonthOfMaxSales(sale);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldQuantityMonthOfMinimumSales() {
        Stats minMonth = new Stats();

        //подготавливаем данные
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = minMonth.quantityMonthOfMinimumSales(sale);
        assertEquals(expected, actual);
    }

}