package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodTest {

    @Test
    @DisplayName("Food 객체 생성 테스트")
    void foodTest() {
        Food food = new Food("양파", 1000);

        Assertions.assertEquals("양파", food.getName());
        Assertions.assertEquals(1000, food.getPrice());
    }

}