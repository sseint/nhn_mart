package com.nhnacademy.mart;

import java.util.Arrays;

public class NhnMart {

    private final FoodStand foodStand = new FoodStand();
    private final Counter counter = new Counter();

    public void prepareMart() {
        fillFoodStand();
    }

    // 음식 세팅 > Food를 FoodStand에 세팅
    private void fillFoodStand() {
        for (int i = 0; i < 2; i++) {
            foodStand.add(new Food("양파", 1_000));
        }
        for (int i = 0; i < 5; i++) {
            foodStand.add(new Food("계란", 5_000));
        }
        for (int i = 0; i < 10; i++) {
            foodStand.add(new Food("파", 500));
        }
        for (int i = 0; i < 20; i++) {
            foodStand.add(new Food("사과", 2_000));
        }
//        System.out.println(foodStand.toString());
    }

    public FoodStand getFoodStand() {
        //FoodStand를 통해 FoodStand 객체를 반환함

        return foodStand;
    }

    public Counter getCounter() {

        return counter;
    }

    public Basket provideBasket() {

        return new Basket();
    }
}
