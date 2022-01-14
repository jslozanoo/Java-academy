package com.company;

import java.util.Scanner;

public class CheckPassFail {
    Scanner in = new Scanner(System.in);
    int mark;

    public CheckPassFail(){
        System.out.println("Set the value of the variable: ");
        mark = in.nextInt();
        System.out.println("The mark is " + mark);
        if(mark >= 50){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}
