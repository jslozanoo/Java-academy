package BasicJavaEx;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);
    public int Menu(){
        int option;


        System.out.println("__________________");
        System.out.println("Menu");
        System.out.println("1. Basic Java Exercises");
        System.out.println("2. Loop Exercises");
        System.out.println("3. Nested-Loops");
        System.out.println("4. Second Page exercises");
        System.out.println("5. Exit");

        option = this.in.nextInt();
        return option;
    }
    public int MenuBasicJava(){
        int option;

        System.out.println("__________________");
        System.out.println("Menu");
        System.out.println("1. Check and pass fail");
        System.out.println("2. Check parity of a number");
        System.out.println("3. Print numbers in words");
        System.out.println("4. Print days in words");
        System.out.println("5. Exit");

        option = this.in.nextInt();
        return option;
    }
    public int MenuLoopsExercises(){
        int option;

        System.out.println("__________________");
        System.out.println("Menu");
        System.out.println("1. Sum, average and square sum of numbers");
        System.out.println("2. Factorial");
        System.out.println("3. Harmonic sum");
        System.out.println("4. Computing of PI");
        System.out.println("5. CozaLozaWoza");
        System.out.println("6. Exit");

        option = in.nextInt();
        return option;
    }
}
