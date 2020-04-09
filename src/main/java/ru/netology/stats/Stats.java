package ru.netology.stats;

public class Stats {
    // Производим рассчёт суммы продаж
    public long calculateSale(long[] sale){

        long summaSale = 0;
        for (long summ : sale) {
            summaSale += summ;
        }
        return summaSale;
    }

    public long averageAmount(long[] sale){

        return calculateSale(sale)/12;
    }

    public long monthOfMaxSales(long[] sale){

        long month = 1;
        long s = sale[0];
        for (int i = 0; i < 12; i++){
            if (s <= sale[i]){
                month = i+1;
                s= sale[i];
            }
        }
        return month;
    }


    public long monthOfMinimumSales(long[] sale){

        long month = 1;
        long s = sale[0];
        for (int i = 0; i < 12; i++){
            if (s >= sale[i]){
                month = i+1;
                s = sale[i];
            }
        }
        return month;
    }


    public long quantityMonthOfMaxSales(long[] sale){

        long average = averageAmount(sale);
        long maxMonth = 0;
        for (long summ : sale){
            if (summ > average) {
                maxMonth++;
            }
        }
        return maxMonth;
    }


    public long quantityMonthOfMinimumSales(long[] sale){

        long average = averageAmount(sale);
        long minMonth = 0;
        for (long summ : sale){
            if (summ < average) {
                minMonth++;
            }
        }
        return minMonth;
    }

}
