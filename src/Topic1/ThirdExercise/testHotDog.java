package Topic1.ThirdExercise;

public class testHotDog {
    public static void main(String[] args){
        hotDogBuilder newHotDogBuilder = new firstHotDogBuilder();
        hotDogDirector hotDogDirector = new hotDogDirector(newHotDogBuilder);

        hotDogDirector.makeHotDog();

        hotDog firstHotDog = hotDogDirector.getHotDog();
        System.out.println(firstHotDog.toString());

    }
}
