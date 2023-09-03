package com.nhnacademy.mart;

import java.util.ArrayList;

public class Counter {
    private static ArrayList<Food> foods;

    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)
    public static void pay(int totalPrice, int money) {
        System.out.println("총 가격은 " + totalPrice + "원 입니다.");
        if (totalPrice > money) {
            throw new IllegalArgumentException("금액이 부족합니다.");
        } else {
            System.out.println("고객님 결제 후 잔액 : " + (money - totalPrice));
        }
    }
}
