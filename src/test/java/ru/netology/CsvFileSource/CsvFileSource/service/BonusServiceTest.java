package ru.netology.CsvFileSource.CsvFileSource.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/BonusService.csv")
    public void testShouldBonus(int expected, int amount, boolean registered) {
        BonusSevice sevice = new BonusSevice();
        int actual = sevice.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

}
