package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    @DisplayName("pickFoodsTest")
    void pickFoodsTest() {
        BuyList buyList = new BuyList();
        buyList.add("양파 2");
        Customer test = new Customer(buyList);
        Basket basket = new Basket();
        FoodStand foodStand = new FoodStand();
        foodStand.add(new Food("양파", 1000));
        foodStand.add(new Food("양파", 1000));

        Assertions.assertEquals(0, basket.getFoods().size());

    }

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

    @Test
    @DisplayName("payTox 테스트")
    void payToxTest() {
        BuyList buyList = new BuyList();
        buyList.add("과자 1");
        Customer test = new Customer(buyList);
        Basket basket = new Basket();
        basket.add(new Food("과자", 2000));
        Counter count = new Counter();
        test.bring(basket);
        test.payTox(count);

        Assertions.assertEquals(18000, test.getMoney());
    }



}