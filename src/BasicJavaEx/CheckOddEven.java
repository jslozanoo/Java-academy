package BasicJavaEx;

import java.util.Scanner;

public class CheckOddEven {
    Scanner in = new Scanner(System.in);
    int number;

    public CheckOddEven(){
        System.out.println("Enter a number");
        number = in.nextInt();
        System.out.println("The number is: " + number);

        if (number % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }
        System.out.println("bye!");
    }

}
