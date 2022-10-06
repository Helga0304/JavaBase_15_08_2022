package com.hillel.lianova.lessons.homework16;

public enum DrinksMachine {
    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    WATER("Water"),
    COCA_COLA("Coca_cola");

    private String title;
    DrinksMachine(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
