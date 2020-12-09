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
    public int calculateAverageAmount(int[] monthlySales) {
        int average;
        int length = monthlySales.length;
        int sum = calculateSum(monthlySales);
        average = sum / length;
        return average;
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
    public int calculateQuantityOfHigherThenAverageAmount(int[] monthlySales) {
        int higherAmount = 0;
        int average = calculateAverageAmount(monthlySales);

        for (int monthlySale : monthlySales) {
            if (monthlySale > average)
                higherAmount++;
        }
        return higherAmount;
    }

    //Метод подсчета количества месяцев, где доходы от прожад ниже среднего значения
    public int calculateQuantityOfLowerThenAverageAmount(int[] monthlySales) {
        int lowerAmount = 0;
        int average = calculateAverageAmount(monthlySales);

        for (int monthlySale : monthlySales) {
            if (monthlySale < average)
                lowerAmount++;
        }
        return lowerAmount;
    }
}


