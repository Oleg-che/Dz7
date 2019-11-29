package com.cherednik;

public class Main {

    public static void main(String[] args) {
        int luckyTicket = 0;
        for (int ticketNumber = 1; ticketNumber < 1000000; ticketNumber = ticketNumber + 1) {
            if (ticketNumber / 100000 + (ticketNumber / 10000) % 10 + (ticketNumber / 1000) % 10 == (ticketNumber / 100) % 10 + (ticketNumber / 10) % 10 + ticketNumber % 10) {
                luckyTicket = luckyTicket + 1;
            }
        }
        System.out.println("Количество счастливых билетов в серии :" + luckyTicket);
    }
}
