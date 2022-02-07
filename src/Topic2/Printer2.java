package Topic2;

public class Printer2 implements Printers{
    // This printer prints in black and white and in color
    @Override
    public void printBlackAndWhite() {
        System.out.println("Printing in black and White");
    }

    @Override
    public void printColor() {
        System.out.println("This printer can print in full color");
    }
}
