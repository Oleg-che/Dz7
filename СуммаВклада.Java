package com.cherednik;

import java.util.Scanner;

public class Main {
    private static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите сумму :");
        float sum = SCANNER.nextFloat();
        System.out.println("Введите срок :");
        int years = SCANNER.nextInt();
        double percent = 1.5;
        System.out.println("Депозит в размере " + sum + " денег под " + percent + "% годовых на " + years + " лет:\n");
        for (int i = 1; i <= years; i++) {
            sum += (sum * percent) / 100;
            System.out.printf("Год - " + i + ". Сумма: " + "%,.2f денег\n", sum);
        }
        System.out.printf("\nЗа " + years + " лет вы получили %,.2f денег\n", sum);
    }
}
