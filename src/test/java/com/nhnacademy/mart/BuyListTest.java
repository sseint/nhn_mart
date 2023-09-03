package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BuyListTest {

    @Test
    @DisplayName("구매목록 추가 시 null값 테스트")
    void addTest() {
        String object = "";

        Assertions.assertThrows(NullPointerException.class, () -> new BuyList().add(object));
    }

    @Test
    @DisplayName("구매목록 추가 시 잘못된 값 입력 테스트")
    void addWrongTest() {
        String test = "파 2 계란 4 양파";

        Assertions.assertThrows(IllegalArgumentException.class, () -> new BuyList().add(test));
    }

    @Test
    @DisplayName("Item 객체 생성 테스트")
    void itemConstructorTest () {

        Assertions.assertEquals("{name='양파', amount=10}", new BuyList.Item("양파", 10).toString());
    }

    @Test
    @DisplayName("item getName 테스트")
    void getNameTest () {
        Assertions.assertTrue(new BuyList.Item("양파", 10).getName().equals("양파"));
    }

    @Test
    @DisplayName("item getAmount 테스트")
    void getAmountTest() {
        Assertions.assertTrue(new BuyList.Item("양파", 10).getAmount() == 10);
    }
}