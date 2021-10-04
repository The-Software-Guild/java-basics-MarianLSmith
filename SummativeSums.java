package com.sg.foundations.basicsAssignment;

    public class SummativeSums {

        public static void calculateSum(int[] arrayOfInts) {
            int total = 0;
            for (int number : arrayOfInts) {
                total += number;
            }
            System.out.println("Array Sum: " + total);
        }

        public static void main(String[] args) {

            int[] set1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
            int[] set2 = {999, -60, -77, 14, 160, 301};
            int[] set3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                    140, 150, 160, 170, 180, 190, 200, -99};

            calculateSum(set1);
            calculateSum(set2);
            calculateSum(set3);
        }
    }