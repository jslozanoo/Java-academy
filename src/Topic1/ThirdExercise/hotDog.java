package Topic1.ThirdExercise;

public class hotDog implements hotDogPlan{
    private String bread;
    private String sausage;
    private boolean sauces;
    private boolean mashedChips;
    private boolean gratedCheese;
    private boolean vegetables;
    private boolean ham;
    private boolean pineapple;
    private boolean bacon;
    private boolean sweetPickles; //pepinillos

    @Override
    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public void setSausage(String sausage) {
        this.sausage = sausage;

    }

    @Override
    public void setSauces(boolean sauces) {
        this.sauces = true;

    }

    @Override
    public void setMashedChips(boolean chips) {
        this.mashedChips = chips;

    }

    @Override
    public void setGratedCheese(boolean cheese) {
        this.gratedCheese = cheese;
    }

    @Override
    public void setVegetables(boolean vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public void setHam(boolean ham) {
        this.ham = ham;
    }

    @Override
    public void setPineapple(boolean pineapple) {
        this.pineapple = pineapple;

    }

    @Override
    public void setBacon(boolean bacon) {
        this.bacon = bacon;

    }

    @Override
    public void setSweetPickles(boolean pickles) {
        this.sweetPickles = pickles;
    }

    @Override
    public String toString() {
        System.out.println("Thanks for coming, this is your hot dog!!");
        return "hotDog{" +
                "bread = '" + bread + '\'' +
                ", sausage = '" + sausage + '\'' +
                ", sauces = " + sauces +
                ", mashedChips = " + mashedChips +
                ", gratedCheese = " + gratedCheese +
                ", vegetables = " + vegetables +
                ", ham = " + ham +
                ", pineapple = " + pineapple +
                ", bacon = " + bacon +
                ", sweetPickles = " + sweetPickles +
                '}';
    }
}
