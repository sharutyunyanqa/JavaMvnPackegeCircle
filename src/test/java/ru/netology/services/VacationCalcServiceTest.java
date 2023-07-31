package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class VacationCalcServiceTest {
    @ParameterizedTest
//    @CsvSource({
//            "10000,3000,20000,3",
//            "100000,60000,150000,2"
//    })

    @CsvFileSource(files = "src/test/resources/tt.csv")

    public void shouldCalculateVacation(int income, int expenses, int threshold, int expected) {
        VacationCalcService service = new VacationCalcService();


        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }


}

