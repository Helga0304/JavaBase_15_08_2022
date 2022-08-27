package com.hillel.lianova.lessons.homework4;

public class Main {

    public static void main(String[] args) {

        int warriorLi = 13;
        int bowmanLi = 24;
        int riderLi = 46;
        int AttackRateLi = (warriorLi+bowmanLi+riderLi);

        int warriorMin = 9;
        int bowmanMin = 35;
        int riderMin = 12;
        int AttackRateMin = (warriorMin+bowmanMin+riderMin);

        int numberOfWarriorsLi = 860;
        int numberOfWarriorsMin = 860;
        double dynastyMinMore = 1.5;

        double result = numberOfWarriorsMin * dynastyMinMore;

        System.out.println();
        System.out.println("General army attack li " + (AttackRateLi) * numberOfWarriorsLi );

        System.out.println();
        System.out.println("General army attack Min " + (AttackRateMin) * result);

    }


}
