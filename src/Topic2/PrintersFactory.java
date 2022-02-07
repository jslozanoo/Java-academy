package Topic2;

public class PrintersFactory {

    public Printers makePrinter(int typeOfPrinter){
        Printers printer = null;

        if (typeOfPrinter == 1){
            printer = new Printer1();
            return printer;
        }
        else if (typeOfPrinter == 2){
            printer = new Printer2();
            return printer;
        }
        else if (typeOfPrinter == 3){
            printer = new Printer3();
            return printer;
        }
        else {
            return null;
        }
    }

}
