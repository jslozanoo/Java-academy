package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CheckPassFail check;
        CheckOddEven parity;
        PrintNumberInWord numberInWord;
        PrintDayInWord dayInWord;
        int option = 0;

        while (option != 5){
            System.out.println("__________________");
            System.out.println("Menu");
            System.out.println("1. Check and pass fail");
            System.out.println("2. Check parity of a number");
            System.out.println("3. Print numbers in words");
            System.out.println("4. Print days in words");
            System.out.println("5. Exit");
            option = in.nextInt();
            switch (option){
                case 1:
                    check = new CheckPassFail();
                    check = null;
                    break;
                case 2:
                    parity = new CheckOddEven();
                    parity = null;
                    break;
                case 3:
                    numberInWord = new PrintNumberInWord();
                    numberInWord = null;
                    break;
                case 4:
                    dayInWord =  new PrintDayInWord();
                    dayInWord = null;
                    break;

            }

        }



        //
    }
}
