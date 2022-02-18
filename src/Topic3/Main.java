package Topic3;

public class Main {
    public static void main(String[] args){
        Exponential exponential = new Exponential();
        System.out.printf("%.4f%n", exponential.partialSums(20, 9));
        System.out.printf("%.4f%n", exponential.partialSums(5.0000, 9));
        System.out.printf("%.4f%n", exponential.partialSums(0.5000, 9));
        System.out.printf("%.4f%n", exponential.partialSums(-0.5000, 9));
    }
}
