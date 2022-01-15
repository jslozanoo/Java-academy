package LoopExercises;

import java.util.Scanner;

public class ComputePI {
    int max_denominator;
    double sum;
    double pi;
    Scanner in = new Scanner(System.in);

    public ComputePI(){
        System.out.println("Type the max denominator for the expansion series");
        max_denominator = in.nextInt();

        for(int i = 0; i <= max_denominator; i++){
            sum += Math.pow(-1, i) * 1 / (2 * i + 1);
        }
        pi = 4 * sum;
        System.out.println("The approximate value of PI is " + pi);
        System.out.println("The absolute difference between the real value and" +
                " our approximation is " + Math.abs(Math.PI - pi) );
    }
}
