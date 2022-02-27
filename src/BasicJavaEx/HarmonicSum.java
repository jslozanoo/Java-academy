package BasicJavaEx;

import java.util.Scanner;

public class HarmonicSum {
    int max_denominator;
    double sumLeftToRight = 0;
    double sumRightToLeft = 0;
    double absoluteDifference;
    Scanner in = new Scanner(System.in);

    public HarmonicSum(){
        System.out.println("Type the maximum denominator of the harmonic sum");
        max_denominator = in.nextInt();

        for (int i = 1; i <= max_denominator; i++){
            sumLeftToRight += (double) 1 / i;
            sumRightToLeft += (double) 1 / (max_denominator - (i - 1) );
        }
        absoluteDifference = Math.abs(sumLeftToRight - sumRightToLeft);
        System.out.println("The left to right sum is " + sumLeftToRight);
        System.out.println("The right to left sum is " + sumRightToLeft);
        System.out.println("The absolute difference is " + absoluteDifference);
    }
}
