package com.hillel.lianova.lessons.homework14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RockMusic rockMusic = new RockMusic();
        PopMusic popMusic = new PopMusic();
        ClassicMusic classicMusic = new ClassicMusic();
        String[] rockGroup = {"The Beatles", "Nirvana", "Queen", "The Rolling Stones" };
        String[] popGroup = {"Kalush", "Potap and Nastya", "Scriabin", "Time is glass" };
        String[] classicGroup = {"Ludwig van Beethoven", "Franz Peter Schubert", "Antonio Lucio Vivaldi", "Paganini" };

        MusicStyles[] musicStyles = {rockMusic, popMusic, classicMusic};
        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
            if (musicStyle == rockMusic) {
                System.out.println(Arrays.toString(rockGroup));
            } else if (musicStyle == popMusic) {
                System.out.println(Arrays.toString(popGroup));
            } else if (musicStyle == classicMusic) {
                System.out.println(Arrays.toString(classicGroup));
            }
        }
    }
    }
