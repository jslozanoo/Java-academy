package com.company;

import java.util.Scanner;

import LoopExercises.*;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        View view = new View();

        CheckPassFail check;
        CheckOddEven parity;
        PrintNumberInWord numberInWord;
        PrintDayInWord dayInWord;

        SumAverageRunningInt sumAverage;
        Product1ToN product;
        HarmonicSum harmonicSum;
        ComputePI pi;
        CozaLozaWoza coza;

        int optionMenu = 0;       // Option Main Menu
        int optionBasicJava = 0;  //Option Basic Java Exercises
        int optionLoopsExercises = 0; //Option Loops Exercises

        while (optionMenu != 5){
            optionMenu = view.Menu();
            switch (optionMenu){
                case 1: //Option Basic Java Exercises
                    optionBasicJava = view.MenuBasicJava();
                    while (optionBasicJava != 5){
                        switch (optionBasicJava){
                            case 1:
                                check = new CheckPassFail();
                                check = null;
                                optionBasicJava = view.MenuBasicJava();
                                break;
                            case 2:
                                parity = new CheckOddEven();
                                parity = null;
                                optionBasicJava = view.MenuBasicJava();
                                break;
                            case 3:
                                numberInWord = new PrintNumberInWord();
                                numberInWord = null;
                                optionBasicJava = view.MenuBasicJava();
                                break;
                            case 4:
                                dayInWord =  new PrintDayInWord();
                                dayInWord = null;
                                optionBasicJava = view.MenuBasicJava();
                                break;
                        }
                    }
                case 2: //Option Loops Exercises
                    optionLoopsExercises = view.MenuLoopsExercises();
                    while (optionLoopsExercises != 6) {
                        switch (optionLoopsExercises){
                            case 1:
                                sumAverage = new SumAverageRunningInt();
                                sumAverage = null;
                                break;
                            case 2:
                                product = new Product1ToN();
                                product = null;
                                break;
                            case 3:
                                harmonicSum = new HarmonicSum();
                                harmonicSum = null;
                                break;
                            case 4:
                                pi = new ComputePI();
                                pi = null;
                                break;
                            case 5:
                                coza = new CozaLozaWoza();
                        }
                    }

            }
        }
    }
}
