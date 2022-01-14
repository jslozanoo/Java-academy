package com.company;

import java.util.Scanner;

public class PrintDayInWord {
    Scanner in = new Scanner(System.in);
    int dayNumber;
    public PrintDayInWord(){
        System.out.println("Type a number corresponding to that day");
        dayNumber = in.nextInt();

        switch (dayNumber) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid Number!!");
        }
    }
}
