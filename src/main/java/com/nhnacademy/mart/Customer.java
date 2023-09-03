package com.nhnacademy.mart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Customer {

    private static final Logger logger = LoggerFactory.getLogger(Customer.class);

    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;

    // 고객이 가진 돈
    private int money;

    public Customer(BuyList buyList) {
        this.money = 20000;
        this.buyList = buyList; //작성한 구매목록을 본 클래스에 저장함
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;   //mart.provideBasket()을 통해 new Basket return 받음 > 바스켓 초기화해서 본 클래스에 저장함
    }

    // TODO pickFoods 메서드 구현 : Basket에 Food가 들어감
    public void pickFoods(FoodStand foodStand) { //FoodStand 객체를 생성해서 가져왔음
        //식품을 담는다(FoodStand에서 Food를 Busket에 담는다)
        //Jonyoung.pickFoods(mart.getFoodStand());
        //getFoodStand는 return foodStand
        //basket.add(Food food) -> return foods.add(food) > food들을 담은 list를 반환함

        //mart.getFoodStand()를 통해 FoodStand를 가져와서 BuyList랑 비교한 다음 buylist에 있는 것을 FoodStand에서 가져옴
        // buyList = foodStand;

        //items : 내가 필요한 물건, foods : 매장에 있는 물건
        //1. item .. foods 같은지 비교
        ArrayList<Food> foods = foodStand.getFoods();
        ArrayList<BuyList.Item> items = buyList.getItems();

        for(BuyList.Item item : items) {    //buyList에 있는 List items를 BuyList의 Item에 담기
            //Item에 있는 개수만큼 장바구니에 상품을 담고, 진열대에서 제거
            //basket.add(FoodStand로부터 BuyList에 있는 식품들을 담는다);
            for(int i=0; i<item.getAmount(); i++) { //구매목록에 있는 양만큼 담음
                boolean exist = false;
                for(Food food : foods) {
                    if (item.getName().equals(food.getName())) {
                            basket.add(food);
                            foodStand.delete(food.getName());
                            exist = true;
                            break;
                    }

                    }
                    if (!exist) {
                        logger.warn("존재하지 않는 상품 입력");
                        throw new IllegalArgumentException("해당 상품은 존재하지 않습니다.");
                }
            }
        }
    }


    // TODO payTox 메서드 구현  a
    public void payTox(Counter counter) {
        //카운터에서 계산한다.
        //Jinyoung.payTox(mart.getCounter());
        //getCounter는 return counter 하도록 만듦
        int totalPrice = 0;
        if (basket.getFoods() != null) {
            for (Food food : basket.getFoods()) {
                totalPrice += food.getPrice();
            }
        }
        counter.pay(totalPrice, money);
    }


}
