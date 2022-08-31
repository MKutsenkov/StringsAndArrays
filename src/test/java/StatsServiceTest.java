import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


//  !!  Сумму всех продаж !!
public class StatsServiceTest {
    //   [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]
    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(expected, actual);
    }


         // !!  Среднюю сумму продаж в месяц   !!

    //   [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]
    @Test
    public void testAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales) / 12;
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        assertEquals(expected, actual);
    }

    //  Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maxSales(sales);
        long expected = 8;

        assertEquals(expected, actual);
    }

    //  Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)* !!

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minSales(sales);
        long expected = 9;

        assertEquals(expected, actual);
    }


    //   Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    @Test
    public void testavgLess() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.avgLess(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }

    //  Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    @Test
    public void testAvgMore() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //int avg1 = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) /12;
        int actual = service.avgMore(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }




}