package com.nhnacademy.mart;

import java.util.Scanner;

public class NhnMartShell {

    public NhnMartShell() {
    }

    public static void main(String[] args) {
        NhnMart mart = new NhnMart();
        mart.prepareMart();

        BuyList buyList = inputBuyListFromShell();  //1. 구매목록 작성

        // TODO 본인이름 영어로 변수명 작성!
        // 본인이름을 각자 맞게 영어로 변경
        // 홍길동 학생
        // -> hongGilDong or gilDong
        Customer Jinyoung = new Customer(buyList);  //구매목록을 가진 고객 생성

        // 장바구니를 챙긴다.
        //bring(Basket basket)
        Jinyoung.bring(mart.provideBasket());

        // 식품을 담는다.
        //basket.add(Food food)
        //Customer가 pickFoods(마트의 getFoodStand())를 통해 식품을 가져와서 pickFoods를 통해 basket에 담음
        Jinyoung.pickFoods(mart.getFoodStand()); //장바구니에 식품을 담음 > Customer에서 buyList랑 FoodStand를 비교해서 있는 것을 FoodStand에서 가져옴
        // 카운터에서 계산한다.
        Jinyoung.payTox(mart.getCounter()); //장바구니에 담은 식품을 계산함
    }

    private static BuyList inputBuyListFromShell() {
        // TODO Scanner 입력을 받아 buyList 만들기 == > (O)
        Scanner scan = new Scanner(System.in);
        System.out.print("> ");
        String object = scan.nextLine();    //양파 2 계란 2 파 4 > 고정
//        String object = "양파 2 계란 2 파 4";
        BuyList buyList = new BuyList();
        buyList.add(object);

        return buyList;
    }
}
