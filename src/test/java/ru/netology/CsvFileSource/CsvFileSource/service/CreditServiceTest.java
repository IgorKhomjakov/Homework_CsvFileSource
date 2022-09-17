package ru.netology.CsvFileSource.CsvFileSource.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CreditServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Service.csv")
    public void testCreditPayment(int expected, int amount, double percent, int term) {
        CreditService service = new CreditService();
        int actual = (int) service.calculateAmount(amount, percent, term);
        Assertions.assertEquals(expected,actual);
    }
}
