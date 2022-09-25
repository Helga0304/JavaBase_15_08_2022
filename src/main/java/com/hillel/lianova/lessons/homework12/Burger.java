package com.hillel.lianova.lessons.homework12;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    boolean isDoubleMeat;

    public Burger() {

    }

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

        System.out.println("Classic burger contains: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise + ".");
    }

    public Burger(String bun, String meat, String cheese, String greens) {

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;

        System.out.println("Diet burger contains: " + bun + ", " + meat + ", " + cheese + ", " + greens + ".");
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, boolean isDoubleMeat) {

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.isDoubleMeat = isDoubleMeat;

        System.out.println("Double burger contains: " + bun + ", " + meat + " count = " + (isDoubleMeat ? 2 : 1) + ", " + cheese + ", " + greens + ", " + mayonnaise + ". ");
    }

}

