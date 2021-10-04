package com.sg.foundations.basicsAssignment;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Random rGen = new Random();
        String[] dogBreeds = new String[]{"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug",
                "Common Cur", "King Doberman"};
        ArrayList<Integer> rNums = new ArrayList<Integer>();

        System.out.println("What is your dog's name?");
        String dogName = reader.next();

        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");

        System.out.println("\n" + dogName + " is:\n");
        for (String dogBreed : dogBreeds) {

            int rNum = Math.round((rGen.nextFloat()) * 100);
            rNums.add(rNum);
        }

        float noramlizeFactor = 0;
        for (int num : rNums) {
            noramlizeFactor += num;
        }

        int arrayLength = dogBreeds.length;

        for (int i = 0; i < arrayLength; i++) {
//
            int normNum = Math.round((rNums.get(i) / noramlizeFactor) * 100);

            System.out.println(normNum + "% " + dogBreeds[i]);
        }
        System.out.println("\nWow, that's QUITE the dog!");
    }
}
