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

    //고객이 계산하면 장바구니에서 식품이 사라짐
    public void delete(Food food) {
        foods.remove(food);
    }
}
