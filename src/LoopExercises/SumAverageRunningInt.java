package LoopExercises;

import java.util.Scanner;

public class SumAverageRunningInt {
    Scanner in = new Scanner(System.in);

    final int LOWER_BOUND;
    final int UPPER_BOUND;

    public SumAverageRunningInt(){
        System.out.println("Type the lower bound of the numbers: ");
        LOWER_BOUND = in.nextInt();
        System.out.println("Type the upper bound of the numbers: ");
        UPPER_BOUND = in.nextInt();

        int option = 0;

        while(option != 4){
            System.out.println("-----------------");
            System.out.println("Menu: ");
            System.out.println("1. Sum and average of the numbers");
            System.out.println("2. Sum of the squares of the numbers");
            System.out.println("3. Odd sum and even num with difference absolute");
            System.out.println("4. Exit");
            option = in.nextInt();

            switch (option){
                case 1:
                    this.sumAverage();
                    break;
                case 2:
                    this.sumOfSquares();
                    break;
                case 3:
                    this.oddSumAndEvenSum();
                    break;
                default:
                    break;
            }
        }
    }
    private void sumAverage(){
        int sum = 0;

        for (int i = this.LOWER_BOUND; i <= this.UPPER_BOUND; i++){
            sum += i;
        }
        double average = (double) sum/(this.UPPER_BOUND - this.LOWER_BOUND + 1 );
        System.out.println("The sum of " + this.LOWER_BOUND + " to "
                + this.UPPER_BOUND + " is " + sum);
        System.out.println("The average is " + average);
    }
    private void sumOfSquares(){
        int sum = 0;

        for (int i = this.LOWER_BOUND; i <= this.UPPER_BOUND; i++){
            sum += i * i;

        }

        System.out.println("The sum of the squares from " + this.LOWER_BOUND + " to " + this.UPPER_BOUND +
                " is " + sum);
    }
    private void oddSumAndEvenSum(){
        int oddSum = 0;
        int evenSum = 0;

        for (int i = this.LOWER_BOUND; i <= UPPER_BOUND; i++){
            if (i % 2 == 0){
                evenSum += i;
            }
            else {
                oddSum += i;
            }
        }
        int absoluteDifference = (oddSum >= evenSum) ? (oddSum - evenSum) : - (oddSum - evenSum) ;

        System.out.println("The  odd sum of " + this.LOWER_BOUND + " to " + this.UPPER_BOUND +
                " is " + oddSum);
        System.out.println("The  even sum of " + this.LOWER_BOUND + " to " + this.UPPER_BOUND +
                " is " + evenSum);
        System.out.println("The absolute difference between odd and even sum is " + absoluteDifference);
    }
}
