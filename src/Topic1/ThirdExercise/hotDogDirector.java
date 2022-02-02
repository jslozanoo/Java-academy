package Topic1.ThirdExercise;


import java.util.Scanner;

public class hotDogDirector {
    Scanner in = new Scanner(System.in);
    private hotDogBuilder hotDogBuilder;

    public hotDogDirector(hotDogBuilder hotDogBuilder){
        this.hotDogBuilder = hotDogBuilder;
    }

    public hotDog getHotDog(){
        return this.hotDogBuilder.getHotDog();
    }
    public void makeHotDog(){
        hotDogBuilder.buildBread(); //Build the bread
        hotDogBuilder.buildSausage(); // Build the sausage
        int option = this.menu();
        while (option != 9){
            switch (option) {
                case 1 -> hotDogBuilder.buildSauces();
                case 2 -> hotDogBuilder.buildMashedChips();
                case 3 -> hotDogBuilder.buildGratedCheese();
                case 4 -> hotDogBuilder.buildVegetables();
                case 5 -> hotDogBuilder.buildHam();
                case 6 -> hotDogBuilder.buildPineapple();
                case 7 -> hotDogBuilder.buildBacon();
                case 8 -> hotDogBuilder.buildSweetPickles();
            }
            option = this.menu();
        }
    }
    private int menu(){
        System.out.println("Type the option of your preference");
        System.out.println("1. Add sauces");
        System.out.println("2. Add mashed chips");
        System.out.println("3. Add grated cheese");
        System.out.println("4. Add vegetables");
        System.out.println("5. Add ham");
        System.out.println("6. Add pineapple");
        System.out.println("7. Add bacon");
        System.out.println("8. Add sweet pickles");
        System.out.println("9. Don't add anything else");
        int option = in.nextInt();
        return option;
    }
}
