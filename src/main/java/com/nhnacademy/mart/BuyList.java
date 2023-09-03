package com.nhnacademy.mart;

import java.util.ArrayList;
import java.util.Arrays;

public class BuyList {

    private static final ArrayList<Item> items = new ArrayList<>();

    // TODO add 메서드 생성
    public static void add(String object) {
        String name = "";
        String txt = "^[a-zA-Z가-힣]*$";
        String num = "^[0-9]*$";

        String[] list = object.split(" ");

        if (object.isEmpty() || object.length() <= 0) {
            throw new NullPointerException("값을 입력해주세요");
        }

        if (list.length % 2 != 0) {
            throw new IllegalArgumentException("올바른 값을 입력해주세요");
        }

        int amount = 0;
        for (int i = 0; i < list.length; i++) {
            if (i % 2 == 0) {
                if (list[i].matches(txt)) {
                    name = list[i];
                    continue;
                }
            } else if (i % 2 != 0){
                if (list[i].matches(num)) {
                    amount = Integer.parseInt(list[i]);
                    items.add(new Item(name, amount));
                }
            }
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }


    public static class Item {
        private final String name;
        private final int amount;

        public Item(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() {

            return name;
        }

        public int getAmount() {

            return amount;
        }

        @Override
        public String toString() {
            return "{name='" + name + '\'' +
                    ", amount=" + amount +
                    '}';
        }
    }
}
