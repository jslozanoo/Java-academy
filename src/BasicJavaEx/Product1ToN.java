package BasicJavaEx;

import java.util.Scanner;

public class Product1ToN {
    long product = 1;
    int number;
    Scanner in = new Scanner(System.in);

    public Product1ToN(){
        System.out.println("Type a number to calculate its factorial");
        number = in.nextInt();
        for (int i = 1; i <= number; i++){
            product *= i;
        }
        System.out.println("The factorial of " + number + " is " + product );
    }
}
