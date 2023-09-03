package com.nhnacademy.mart;

import java.util.ArrayList;
import java.util.Arrays;

public class FoodStand {

    private final ArrayList<Food> foods = new ArrayList<>();

    public FoodStand() {

    }

    // TODO add 메서드 구현
    // Food를 FoodStand에 add ==> (O)
    public void add(Food food) {    //add 끝

        foods.add(food);

    }

    // TODO 장바구니에 담은 Food 삭제 구현
    public void delete(String getFoodName) {
        for (int i=0; i < foods.size(); i++) {
            if (foods.get(i).getName().equals(getFoodName)) {   //List foods에서 원하는 값만 삭제하기
                foods.remove(i);
                return;
            }
        }

    }


    public ArrayList<Food> getFoods() {

        return foods;
    }

    @Override
    public String toString() {
        return "FoodStand{" +
                "foods=" + foods.toString() +
                '}';
    }
}
