package com.hillel.lianova.lessons.homework9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int max = 9;
        final int COUNT_PLAYERS = 7;
        int[] array1 =new int[COUNT_PLAYERS];
        int[] array2 =new int[COUNT_PLAYERS];

        for (int i = 0; i < COUNT_PLAYERS; i++) {
            array1[i] = (int) (Math.random() * (max + 1));
            array2[i] = (int) (Math.random() * (max + 1));
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println();

        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println();

        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                counter++;
            }

        }
        System.out.println("number of matches " + counter);
    }
}
