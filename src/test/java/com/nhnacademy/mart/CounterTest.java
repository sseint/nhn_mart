package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {

    @Test
    @DisplayName("예산 초과 테스트")
    void cashTest() {
        Counter counter = new Counter();
        int money = 10000;
        int totalPrice = 15000;

        Assertions.assertThrows(IllegalArgumentException.class, () -> counter.pay(totalPrice, money));
    }

}