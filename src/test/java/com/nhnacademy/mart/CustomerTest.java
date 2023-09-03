package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    @DisplayName("해당 상품이 없는 경우")
    void noFoodTest() {
        BuyList buylist = new BuyList();
        buylist.add("과자 2");
        Customer test = new Customer(buylist);
        FoodStand foodStand = new FoodStand();
        foodStand.add(new Food("양파", 1000));

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Customer(buylist).pickFoods(foodStand));
    }


}