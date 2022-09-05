package com.hillel.lianova.lessons.homework6;

public class Main {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 1; i <= 155; i++) {

            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9) {

                continue;

            } else if (i / 10 % 10 == 4 || i / 10 % 10 == 9 ) {

                continue;
            }

                System.out.println(i);
    counter++;

        }
        System.out.println("counter shuttle: " + counter);
    }
}
