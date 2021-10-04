package com.sg.foundations.basicsAssignment;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("What is your age?");
        int userAge  = reader.nextInt();

        int maxHR = 220 - userAge;
        int lowHR = (int) Math.round(0.5 * (maxHR));
        int highHR = (int) Math.round(0.85 * (maxHR));

        System.out.println("Your maximum heart rate should be "+maxHR+" beats per minute");
        System.out.println("Your target HR Zone is "+lowHR+" - "+highHR+" beats per minute");
    }
}
