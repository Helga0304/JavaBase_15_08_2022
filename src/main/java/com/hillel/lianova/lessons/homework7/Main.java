package com.hillel.lianova.lessons.homework7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number = (int) (Math.random() * 11);
        System.out.println(number);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter integer from 0 to 10");

        for (int i = 0; i < 4; i++) {
            System.out.println("a request: " + (i+1));
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                if (answer == number) {
                    System.out.println("WIN!!!");
                    break;
                } else if (i != 3) {
                    System.out.println("Try again");
                } else {
                    System.out.println("LOSE");
                }
            } else {
                System.out.println("WRONG DATA! TRY AGAIN!");
            }
        }
    }
}



