package com.hillel.lianova.lessons.homework12;

public class BurgerMain extends Burger {
    public static void main(String[] args) {
        Burger classicBurger = new Burger("rye", "pork", "dutch", "salad", "mayonnaise");
        Burger dietBurger = new Burger("sesame", "chicken", "gouda", "salad");
        Burger doubleBurger = new Burger("brioche", "beaf", "ukrainian", "salad", "mayonnaise",true);
    }
}
