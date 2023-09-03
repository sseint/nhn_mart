package com.nhnacademy.mart;

import java.util.ArrayList;

public class Basket {
    private final ArrayList<Food> foods = new ArrayList<>();

    //고객이 식품을 장바구니에 담음
    public void add(Food food) {

        foods.add(food);
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }
}
