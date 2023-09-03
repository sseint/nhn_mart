package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    @DisplayName("add테스트")
    void addTest() {
        Basket basket = new Basket();
        Food food = new Food("고구마", 1000);
        basket.add(food);

        Assertions.assertEquals(1, basket.getFoods().size());
    }

    @Test
    @DisplayName("getFoods테스트")
    void getFoodsTest() {
        Basket basket = new Basket();
        ArrayList<Food> foods = new ArrayList<>();
        Food food = new Food("고구마", 1000);
        basket.add(food);

        Assertions.assertTrue(basket.getFoods().get(0).getName().equals("고구마"));
    }

}