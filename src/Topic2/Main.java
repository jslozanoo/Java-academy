package Topic2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintersFactory printersFactory = new PrintersFactory(); // Instantiate the factory Printer
        Printers printer; // Set a slot of memory for the interface

        System.out.println("Hello!! Please choose a printer to print your document:");
        System.out.println("Type 1 or 2 for the old printers. If you'd like to try the new one type 3");
        int typeOfPrinter = in.nextInt();
        printer = printersFactory.makePrinter(typeOfPrinter);
        /*
        In the previous three lines of code we can update if new printers are available.
        In addition, we only have to update the code in the PrintersFactory class because
        there is where the printers objects are setting. The user class are completely decoupled from
        the printers ones.
        I make a test with a third printer
         */

        User user = new User(printer); // The user is going to print in any printer he/she wants.

        user.printInBlackAndWhite();
        user.printInColor();

        

    }

}
