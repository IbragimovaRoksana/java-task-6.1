package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;

class StatsServiceTest {

    @ParameterizedTest
    @CsvSource("'CalculateSum',8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18, 180")
    void shouldCalculateSum(String text, int january, int febrary, int march, int april, int may, int june, int july, int august, int september, int october, int november, int desember, int expected) {
        StatsService service = new StatsService();
        int[] salesAmount = {january, febrary, march, april, may, june, july, august, september, october, november, desember};
        int actual = service.calculateSum(salesAmount);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource("'CalculateAverageAmount',8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18, 15")
    void shouldCalculateAverageAmount(String text, int january, int febrary, int march, int april, int may, int june, int july, int august, int september, int october, int november, int desember, int expected) {
        StatsService service = new StatsService();
        int[] salesAmount = {january, febrary, march, april, may, june, july, august, september, october, november, desember};
        int actual = service.calculateAverageAmount(salesAmount);
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource("'NumberOfMaxMonth',8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18, 8")
    void shouldCalculateNumberMaxMonth(String text, int january, int febrary, int march, int april, int may, int june, int july, int august, int september, int october, int november, int desember, int expected) {
        StatsService service = new StatsService();
        int[] salesAmount = {january, febrary, march, april, may, june, july, august, september, october, november, desember};
        int actual = service.calculateNumberMaxMonth(salesAmount);
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource("'NumberOfMinMonth',8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18, 9")
    void shouldCalculateNumberMinMonth(String text, int january, int febrary, int march, int april, int may, int june, int july, int august, int september, int october, int november, int desember, int expected) {
        StatsService service = new StatsService();
        int[] salesAmount = {january, febrary, march, april, may, june, july, august, september, october, november, desember};
        int actual = service.calculateNumberMinMonth(salesAmount);
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource("'QuantityOFHigherMonth',8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18, 5")
    void shouldCalculateQuantityOfHigherThenAverageAmount(String text, int january, int febrary, int march, int april, int may, int june, int july, int august, int september, int october, int november, int desember, int expected) {
        StatsService service = new StatsService();
        int[] salesAmount = {january, febrary, march, april, may, june, july, august, september, october, november, desember};
        int actual = service.calculateQuantityOfHigherThenAverageAmount(salesAmount);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource("'QuantityOFLowerMonth',8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18, 5")
    void shouldCalculateQuantityOfLowerThenAverageAmount(String text, int january, int febrary, int march, int april, int may, int june, int july, int august, int september, int october, int november, int desember, int expected) {
        StatsService service = new StatsService();
        int[] salesAmount = {january, febrary, march, april, may, june, july, august, september, october, november, desember};
        int actual = service.calculateQuantityOfLowerThenAverageAmount(salesAmount);
        assertEquals(expected, actual);
    }
}