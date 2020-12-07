package ru.netology.stats;

public class StatsService {

    //Метод подсчета суммы всех продаж
    public int calculateSum(int[] monthlySales) {
        int sum = 0;

        for (int monthlySale : monthlySales)
            sum += monthlySale;
        return sum;
    }

    //Метод подсчета среднего значения продаж
    public int calculateAvarageAmount(int[] monthlySales) {
        int sum = 0, avarage = 0;
        int length = monthlySales.length;

        for (int monthlySale : monthlySales) {
            sum += monthlySale;
        }
        avarage = sum / length;
        return avarage;
    }

    //Метод подсчета номеров месяцев, где выявлены максимумы продаж
    public int calculateNumberMaxMonth(int[] monthlySales) {
        int month = 0, max = 0, numberOfMonth = 0;

        for (int monthlySale : monthlySales) {
            month++;
            if (monthlySale >= max) {
                max = monthlySale;
                numberOfMonth = month;
            }
        }
        return numberOfMonth;
    }

    //Метод подсчета номеров месяцев, где выявлены минимумы продаж
    public int calculateNumberMinMonth(int[] monthlySales) {
        int month = 0, min = monthlySales[0], numberOfMonth = 0;

        for (int monthlySale : monthlySales) {
            month++;
            if (monthlySale <= min) {
                min = monthlySale;
                numberOfMonth = month;
            }
        }
        return numberOfMonth;
    }

    //Метод подсчета количества месяцев, где доходы от прожад выше среднего значения
    public int calculateQuantityOfHigherThenAvarageAmount(int[] monthlySales) {
        int sum = 0, avarage, HigherAmount = 0;
        int length = monthlySales.length;

        for (int monthlySale : monthlySales) {
            sum += monthlySale;
        }
        avarage = sum / length;

        for (int monthlySale : monthlySales) {
            if (monthlySale > avarage)
                HigherAmount++;
        }
        return HigherAmount;
    }

    //Метод подсчета количества месяцев, где доходы от прожад ниже среднего значения
    public int calculateQuantityOfLowerThenAvarageAmount(int[] monthlySales) {
        int sum = 0, avarage, LowerAmount = 0;
        int length = monthlySales.length;

        for (int monthlySale : monthlySales) {
            sum += monthlySale;
        }
        avarage = sum / length;

        for (int monthlySale : monthlySales) {
            if (monthlySale < avarage)
                LowerAmount++;
        }
        return LowerAmount;
    }
}


