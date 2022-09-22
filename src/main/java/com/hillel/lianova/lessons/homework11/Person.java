package com.hillel.lianova.lessons.homework11;

public class Person {
    public static void main(String[] args) {
        String name = "Harry";
        String surname = " Potter";
        String cityName = "Little Whinging";
        int phoneNumber = 666161161;

        System.out.println(personInfo(name, surname, cityName, phoneNumber));
        System.out.println(personInfo("Ronald ", "Weasley", "London", 977733355));
        System.out.println(personInfo("Hermione ", "Granger", "Paris", 981234567));
    }

    static String personInfo(String name, String surname, String cityName, int phoneNumber) {
        return ("Call a person " + name + surname + " from the city " + cityName + " by number " + phoneNumber);
    }
}
