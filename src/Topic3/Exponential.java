package Topic3;

import java.text.DecimalFormat;

public class Exponential {
    private int factorial(int number){
        return (number == 1 ) ? 1 : factorial(number - 1) * number;
    }

    private double mainTerm(double x, int n){
        return Math.pow(x, n) / factorial(n);
    }

    public double partialSums(double x, int n){
        return (n == 0) ? 1 : partialSums(x, n - 1) + mainTerm(x , n);
    }
}
