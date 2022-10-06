package com.hillel.lianova.lessons.homework16;

public class Drinks {
    final int coffee = 25;
    final int tea = 15;
    final int lemonade = 30;
    final int mojito = 50;
    final int  water = 10;
    final int  coca_cola = 20;

    public static int coffeeCount;
    public static int teaCount;
    public static int lemonadeCount;
    public static int mojitoCount;
    public static int waterCount;
    public static int coca_colaCount;

    public void CoffeeCount() {
        coffeeCount += coffee;
    }

    public void TeaCount() {
        teaCount += tea;
    }
    public void LemonadeCount() {
        lemonadeCount += lemonade;
    }
    public void MojitoCount() {
        mojitoCount += mojito;
    }
    public void WaterCount() {
        waterCount += water;
    }
    public void Coca_colaCount() {
        coca_colaCount += coca_cola;
    }
    public void Total() {
        if (coffeeCount > coffee) {
            System.out.println("You order " + coffeeCount / coffee + " " + DrinksMachine.COFFEE.getTitle() +
                    " for a total of " + coffeeCount + " $");

        }
        if (teaCount > tea) {
            System.out.println("You order " + teaCount / tea + " " + DrinksMachine.TEA.getTitle() +
                    " for a total of " + teaCount + " $");

        }
        if (lemonadeCount > lemonade) {
            System.out.println("You order " + lemonadeCount / lemonade + " " + DrinksMachine.LEMONADE.getTitle() +
                    " for a total of " + lemonadeCount + " $");

        }
        if (mojitoCount > mojito) {
            System.out.println("You order " + mojitoCount / mojito + " " + DrinksMachine.MOJITO.getTitle() +
                    " for a total of " + mojitoCount + " $");

        }
        if (waterCount > water) {
            System.out.println("You order " + waterCount / water + " " + DrinksMachine.WATER.getTitle() +
                    " for a total of " + waterCount + " $");

        }      if (coca_colaCount > coca_cola) {
            System.out.println("You order " + coca_colaCount / coca_cola + " " + DrinksMachine.COCA_COLA.getTitle() +
                    " for a total of " + coca_colaCount + " $");
        }
        int  total=coffeeCount+teaCount+lemonadeCount+mojitoCount+waterCount+coca_colaCount;
        System.out.println("Total amount of " + total + " $");
    }
}

