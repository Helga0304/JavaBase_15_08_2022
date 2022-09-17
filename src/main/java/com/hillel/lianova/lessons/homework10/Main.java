package com.hillel.lianova.lessons.homework10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = getNumber(scanner);
        int m = getNumber(scanner);

        int[][] array1 = new int[n][m];
        int[][] array2 = new int[m][n];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 101);
            }
        }
        System.out.println("first array");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];
            }
        }
        System.out.println("second array");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
    static int getNumber(Scanner scanner) {
        int temp = 0;
        System.out.println("Please enter integer for arrays");
        while (true) {
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                if (temp < 0) {
                    System.out.println("WRONG DATA,PLEASE ENTER INTEGER GREATER 0");
                } else {
                    break;
                }
            } else {
                System.out.println("WRONG DATA,TRY AGAIN");
                scanner.nextLine();
            }
        }
        return temp;
    }
}