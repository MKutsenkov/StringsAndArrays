public class StatsService {



    //  !!  Сумму всех продаж !!
    public long sum(long[] sales) {
        long sum = 0;

        for (long sale: sales) {
             sum += sale;
        }
        return sum;
    }

   // !!  Среднюю сумму продаж в месяц   !!
    public long average(long[] sales){
        return sum(sales) / 12;
    }

   // !!  Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
   public int maxSales(long[] sales) {
       int maxMonth = 0;
       int month = 0; // переменная для индекса рассматриваемого месяца в массиве
       for (long sale : sales) {
           // sales[minMonth] - продажи в месяце minMonth
           // sale - продажи в рассматриваемом месяце
           if (sale >= sales[maxMonth]) {
               maxMonth = month;
           }
           month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
       }
       return maxMonth + 1;
       // System.out.println(maxMonth);
   }

   // !! Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)* !!
    public int minSales(long[] sales) {
       int minMonth = 0;
       int month = 0; // переменная для индекса рассматриваемого месяца в массиве
       for (long sale : sales) {
           // sales[minMonth] - продажи в месяце minMonth
           // sale - продажи в рассматриваемом месяце
           if (sale <= sales[minMonth]) {
               minMonth = month;
           }
           month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
       }
       return minMonth + 1;
    }

   // !!  Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
     public  int avgLess(long[] sales) {
        long avg = average(sales);  // вызвали метод подсчета среднего значения
        int count = 0;                  // заводим счетчик
        for (long sale: sales) {      //  перебираем продажи

                if (sale < avg) {      //  если продажа ниже средней то
                    count++;           //  то прибавляем один месяц
                }
           }
         return count;
        }



   // !!  Кол-во месяцев, в которых продажи были выше среднего (см. п.2)

     public  int avgMore(long[] sales) {
        long avg = average(sales);  // вызвали метод подсчета средннго
        int count1 = 0;                  // заводим счетчик
        for (long sale: sales) {      //  перебираем продажи

                if (sale > avg) {      //  если продажа выше средней то
                    count1++;           //  то прибавляем один месяц
                }


        }
        return count1;
     }

}
                               //  [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]