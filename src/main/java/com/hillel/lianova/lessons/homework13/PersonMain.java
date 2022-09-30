package com.hillel.lianova.lessons.homework13;

public class PersonMain {

    public static void main(String[] args) {
        FitnessTracker person1 = new FitnessTracker("Olha", 3, 4,
                1988, "lyanovaolya@gmail.com", 56635116, "Lianova",
                56, 120, 70, 10000);
        person1.printAccountInfo();

        FitnessTracker person2 = new FitnessTracker("Harry", 5, 8,
                1998, "potterharry@gmail.com", 56661236, "Potter",
                66, 130, 80, 9000);
        person2.printAccountInfo();

        FitnessTracker person3 = new FitnessTracker("Hermione", 12, 5,
                1999, "grangerhermione@gmail.com", 891236612, "Granger",
                60, 120, 70, 8000);
        person3.printAccountInfo();
        person3.setLowerPressure(80);
        person3.setNumberOfSteps(10000);
        person3.setTopPressure(120);
        person3.setWeight(70);
        person3.printAccountInfo();

        FitnessTracker person4 = new FitnessTracker("Ronald", 5, 5,
                1998, "weasleyronald@gmail.com", 563335555, "Weasley",
                90, 120, 80, 5000);
        person4.printAccountInfo();
        person4.setLowerPressure(100);
        person4.setNumberOfSteps(8000);
        person4.setTopPressure(160);
        person4.setWeight(100);
        person4.printAccountInfo();

    }
}
