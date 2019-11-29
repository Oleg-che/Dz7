package com.cherednik;

import java.util.Arrays;
import java.util.Random;

public class Average {
    private static Random RANDOM = new Random();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Array()));
        System.out.println();
        System.out.println(average());
        System.out.println();
        System.out.println(Arrays.toString(Array2()));
    }

    private static int[] Array() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(100);
        }
        return arr;
    }

    private static double average() {
        double average = 0;
        if (Array().length > 0) {
            double sum = 0;
            for (int j = 0; j < Array().length; j++) {
                sum += Array()[j];
                average = sum / Array().length;
            }
        }
        return average;
    }

    private static int[] Array2() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(100) + (int) average();
        }
        return arr;
    }
}
