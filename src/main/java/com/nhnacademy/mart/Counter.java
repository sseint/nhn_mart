package com.nhnacademy.mart;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Counter {
    private static ArrayList<Food> foods;
    private static final Logger logger = LoggerFactory.getLogger(Counter.class);

    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)
    public static void pay(int totalPrice, int money) {
        System.out.println("총 가격은 " + totalPrice + "원 입니다.");
        if (totalPrice > money) {
            logger.warn("사려는 상품 금액이 보유 금액을 초과할 수 없음");
            throw new IllegalArgumentException("금액이 부족합니다.");
        } else {
            logger.info("결제 금액 : " + totalPrice + ", 보유 금액 : " + money + "결제 후 잔액 : " + (money - totalPrice));
            System.out.println("고객님 결제 후 잔액 : " + (money - totalPrice));
        }
    }
}
