package com.hillel.lianova.lessons.homework15;

public class Android implements Smartphones,Linux {
    @Override
    public void call() {
        System.out.println("Call-android");
    }
    @Override
    public void sms() {
        System.out.println("Sms-android");
    }
    @Override
    public void internet() {
        System.out.println("Internet-android");
    }
    @Override
    public void googlePlay() {
        System.out.println("Google Play-android");
    }
}
