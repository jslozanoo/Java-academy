package Topic1.ThirdExercise;

import java.util.Locale;
import java.util.Scanner;

public class firstHotDogBuilder implements hotDogBuilder{
    private hotDog hotDog;
    Scanner in = new Scanner(System.in);

    public firstHotDogBuilder(){hotDog = new hotDog();}

    @Override
    public void buildBread() {
        // Brioche, vienna or vegano
        String bread = "";
        while (!bread.toLowerCase(Locale.ROOT).equals("brioche")){
            System.out.println("Choose the kind of bread (Type brioche, vienna or vegan)");
            bread = in.nextLine();
            if (bread.toLowerCase(Locale.ROOT).equals("vienna")){
                break;
            }
            else if(bread.toLowerCase(Locale.ROOT).equals("vegan")){
                break;
            }
        }
        this.hotDog.setBread(bread);
    }

    @Override
    public void buildSausage() {
        // Turkey, pork or mixed
        String sausage = "";
        while (!sausage.toLowerCase(Locale.ROOT).equals("turkey")){
            System.out.println("Choose the kind of sausage (Type turkey, pork or mixed)");
            sausage = in.nextLine();
            if (sausage.toLowerCase(Locale.ROOT).equals("pork")){
                break;
            }
            else if(sausage.toLowerCase(Locale.ROOT).equals("mixed")){
                break;
            }
        }
        this.hotDog.setSausage(sausage);

    }

    @Override
    public void buildSauces() {
        this.hotDog.setSauces(true);
        System.out.println("sauces added");
    }

    @Override
    public void buildMashedChips() {
        this.hotDog.setMashedChips(true);
        System.out.println("mashed chips added");
    }

    @Override
    public void buildGratedCheese() {
        this.hotDog.setGratedCheese(true);
        System.out.println("grated cheese added");
    }

    @Override
    public void buildVegetables() {
        this.hotDog.setVegetables(true);
        System.out.println("vegetables added");
    }

    @Override
    public void buildHam() {
        this.hotDog.setHam(true);
        System.out.println("ham added");
    }

    @Override
    public void buildPineapple() {
        this.hotDog.setPineapple(true);
        System.out.println("pineapple added");

    }

    @Override
    public void buildBacon() {
        this.hotDog.setBacon(true);
        System.out.println("bacon added");
    }

    @Override
    public void buildSweetPickles() {
        this.hotDog.setSweetPickles(true);
        System.out.println("sweet pickles added");
    }
    public hotDog getHotDog(){
        return this.hotDog;
    }
}
