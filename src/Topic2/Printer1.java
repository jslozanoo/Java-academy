package Topic2;

public class Printer1 implements Printers{
    // This printer print only in black and white
    @Override
    public void printBlackAndWhite() {
        System.out.println("Printing in black and White");
    }

    @Override
    public void printColor() {
        System.out.println("This printer does not print in full color");

    }


}
