package com.hillel.lianova.lessons.homewotk8;

public class Main {
    public static void main(String[] args) {


        final int COUNT_PLAYERS = 25;

        int[] team1 = new int[COUNT_PLAYERS];
        int[] team2 = new int[COUNT_PLAYERS];

        int minAge = 18;
        int maxAge = 40;

        for (int i = 0; i < team1.length; i++) {
            team1[i] = minAge + (int) (Math.random() * (maxAge - minAge + 1));
            if (i < team1.length - 1) {
                System.out.print(team1[i] + ", ");
            } else {
                System.out.print(team1[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < team2.length; i++) {
            team2[i] = minAge + (int) (Math.random() * (maxAge - minAge + 1));
            if (i < team2.length - 1) {
                System.out.print(team2[i] + ", ");
            } else {
                System.out.print(team2[i]);
            }
        }
        System.out.println();

        int sumTeam1 = 0;
        for (int i = 0; i < team2.length; i++) {
            sumTeam1 += team1[i];
        }
            int avgTeam1 = sumTeam1 / team1.length;
            System.out.println("Average age team " + avgTeam1);
        }
}


