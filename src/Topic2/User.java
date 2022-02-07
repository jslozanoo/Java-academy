package Topic2;

public class User {
    private Printers printer;

    public User(Printers printer){
        this.printer = printer;
    }
    public void printInBlackAndWhite(){
        this.printer.printBlackAndWhite();
    }
    public void printInColor(){
        this.printer.printColor();
    }
}
