package com.hillel.lianova.lessons.homework15;

public class Main {
    public static void main(String[] args) {
        Android android = new Android();
        System.out.println("Android: ");
        android.call();
        android.sms();
        android.internet();
        android.googlePlay();

        Iphones iphones = new Iphones();
        System.out.println("\nApple: ");
        iphones.call();
        iphones.sms();
        iphones.internet();
        iphones.appleStore();
    }
}
