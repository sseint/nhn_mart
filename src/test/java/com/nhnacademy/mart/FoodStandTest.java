package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FoodStandTest {

    @Test
    @DisplayName("재고부족 테스트")
    void nothingTest() {
        FoodStand foodStand = new FoodStand();

        foodStand.add(new Food("양파", 1000));
        foodStand.delete("양파");

        Assertions.assertEquals(0, foodStand.getFoods().size());
    }



}