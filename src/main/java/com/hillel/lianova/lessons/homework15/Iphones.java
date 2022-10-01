package com.hillel.lianova.lessons.homework15;

public class Iphones implements Smartphones, Ios {
    @Override
    public void call() {
        System.out.println("Call-iPhones");
    }
    @Override
    public void sms() {
        System.out.println("Sms-iPhones");
    }
    @Override
    public void internet() {
        System.out.println("Internet-iPhones");
    }
    @Override
    public void appleStore() {
        System.out.println("Apple Store-iPhones");
    }
}
