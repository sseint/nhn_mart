package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NhnMartTest {

    @Test
    @DisplayName("NHNMart 객체 생성 테스트")
    void nhnmartConstructorTest() {
        NhnMart nhnMart = new NhnMart();

        nhnMart.prepareMart();

        Assertions.assertEquals(37, nhnMart.getFoodStand().getFoods().size());
    }

}