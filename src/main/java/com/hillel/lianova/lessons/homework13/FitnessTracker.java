package com.hillel.lianova.lessons.homework13;

public class FitnessTracker {
    private final String NAME;
    private final int DAY_OF_BIRTHDAY;
    private final int MONTH_OF_BIRTH;
    private final int YEAR_OF_BIRTH;
    private final String EMAIL ;
    private final int PHONE_NUMBER;
    private String surname;
    private double weight;
    private int topPressure;
    private int lowerPressure;
    private int numberOfSteps;
    private int age;

    public FitnessTracker(String NAME, int DAY_OF_BIRTHDAY, int MONTH_OF_BIRTH, int YEAR_OF_BIRTH, String EMAIL,
                          int PHONE_NUMBER, String surname, double weight, int topPressure, int lowerPressure,
                          int numberOfSteps) {
        this.NAME = NAME;
        this.DAY_OF_BIRTHDAY = DAY_OF_BIRTHDAY;
        this.MONTH_OF_BIRTH = MONTH_OF_BIRTH;
        this.YEAR_OF_BIRTH = YEAR_OF_BIRTH;
        this.EMAIL = EMAIL;
        this.PHONE_NUMBER = PHONE_NUMBER;
        this.surname = surname;
        this.weight = weight;
        this.topPressure = topPressure;
        this.lowerPressure = lowerPressure;
        this.numberOfSteps = numberOfSteps;
        age = 2020 - YEAR_OF_BIRTH;
    }

    public String getNAME() {
        return NAME;
    }

    public int getDAY_OF_BIRTHDAY() {
        return DAY_OF_BIRTHDAY;
    }

    public int getMONTH_OF_BIRTH() {
        return MONTH_OF_BIRTH;
    }

    public int getYEAR_OF_BIRTH() {
        return YEAR_OF_BIRTH;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public int getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public int getTopPressure() {
        return topPressure;
    }

    public int getLowerPressure() {
        return lowerPressure;
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTopPressure(int topPressure){
        this.topPressure = topPressure;
    }
    public void setLowerPressure(int lowerPressure) {
        this.lowerPressure = lowerPressure;
    }

    public void setNumberOfSteps(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    public void printAccountInfo(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return "Fitness Tracker Person Info" +
                " NAME = " + NAME +
                ", surname = " + surname + "," + "\n" +
                " DAY_OF_BIRTHDAY = " + DAY_OF_BIRTHDAY +
                ", MONTH_OF_BIRTH = " + MONTH_OF_BIRTH +
                ", YEAR_OF_BIRTH = " + YEAR_OF_BIRTH +
                ", age = " + age + "," + "\n" +
                " EMAIL = " + EMAIL +
                ", PHONE_NUMBER = " + PHONE_NUMBER + "," + "\n" +
                " weight = " + weight +
                ", pressure = " + topPressure + "/" + lowerPressure +
                ", numberOfSteps = " + numberOfSteps + "\n";

    }
}



