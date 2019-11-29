package com.cherednik;

public class Average {

    public static void main(String[] args) {
        int hours, minutes, h1, h2, m1, m2, time;
        hours = 0;
        minutes = 0;
        time = 0;
        while (hours < 24) {
            h1 = hours / 10;
            h2 = hours % 10;
            m1 = minutes / 10;
            m2 = minutes % 10;
            if (h1 == m2 && h2 == m1) {
                time++;
            }
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
            }
        }
        System.out.println("Количество симметричных комбиначий: " + time);
    }
}
