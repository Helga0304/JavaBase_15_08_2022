package com.hillel.lianova.lessons.homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String team1 ;

        System.out.println("Please enter team1 name");
        String str = scanner.nextLine();
        System.out.println("You entered: " + str);

        int intVariable1=0;
        System.out.println("Please enter frags for player 1");
        if (scanner.hasNextInt()) {
            intVariable1 = scanner.nextInt();
            System.out.println("You entered number: " + intVariable1 );
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit( 0);
        }
        int intVariable2 = 0;
        System.out.println("Please enter frags for player 2");
        if (scanner.hasNextInt()) {
            intVariable2 = scanner.nextInt();
            System.out.println("You entered number: " + intVariable2 );
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit( 0);
        }
        int intVariable3 = 0;
        System.out.println("Please enter frags for player 3");
        if (scanner.hasNextInt()) {
            intVariable3 = scanner.nextInt();
            System.out.println("You entered number: " + intVariable3 );
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit( 0);
        }
        int intVariable4 = 0;
        System.out.println("Please enter frags for player 4");
        if (scanner.hasNextInt()) {
            intVariable4 = scanner.nextInt();
            System.out.println("You entered number: " + intVariable4 );
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit( 0);
        }
        int intVariable5 = 0;
        System.out.println("Please enter frags for player 5");
        if (scanner.hasNextInt()) {
            intVariable5 = scanner.nextInt();
            System.out.println("You entered number: " + intVariable5 );
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit( 0);
        }

        scanner.nextLine();

        String team2;

        System.out.println("Please enter team2 name");
        String str2 = scanner.nextLine();
        System.out.println("You entered: " + str2);

        int intVariable6 = 0;
        System.out.println("Please enter frags for player 1");
        if (scanner.hasNextInt()) {
            intVariable6 = scanner.nextInt();
            System.out.println("You entered number: " + intVariable6 );
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit( 0);
        }
        int intVariable7 = 0;
        System.out.println("Please enter frags for player 2");
        if (scanner.hasNextInt()) {
            intVariable7 = scanner.nextInt();
            System.out.println("You entered number: " + intVariable7 );
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit( 0);
        }
        int intVariable8 = 0;
        System.out.println("Please enter frags for player 3");
        if (scanner.hasNextInt()) {
            intVariable8 = scanner.nextInt();
            System.out.println("You entered number: " + intVariable8 );
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit( 0);
        }
        int intVariable9 = 0;
        System.out.println("Please enter frags for player 4");
        if (scanner.hasNextInt()) {
            intVariable9 = scanner.nextInt();
            System.out.println("You entered number: " + intVariable9 );
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit( 0);
        }
        int intVariable10 = 0;
        System.out.println("Please enter frags for player 5");
        if (scanner.hasNextInt()) {
            intVariable10 = scanner.nextInt();
            System.out.println("You entered number: " + intVariable10 );
        } else {
            System.out.println("WRONG DATA, RESTART!");
            System.exit( 0);
        }

scanner.close();

        System.out.println(intVariable1+intVariable2+intVariable3+intVariable4+intVariable5);
        System.out.println(intVariable6+intVariable7+intVariable8+intVariable9+intVariable10);

        double resultTeam1 = ((double)(intVariable1+intVariable2+intVariable3+intVariable4+intVariable5 ) /5 );
        double resultTeam2 = ((double)(intVariable6+intVariable7+intVariable8+intVariable9+intVariable10 ) /5 );

        System.out.println(resultTeam1);
        System.out.println(resultTeam2);

        if (resultTeam1 > resultTeam2) {
            System.out.println("resultTeam1 > resultTeam2");
        } else if (resultTeam1 == resultTeam2) {
                System.out.println("resultTeam1 = resultTeam2");
            } else {
                System.out.println("resultTeam1 < resultTeam2");
        }

        System.out.println("team won " + str2 + " scored " + resultTeam2 + " points "  );
    }
}