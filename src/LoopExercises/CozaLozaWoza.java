package LoopExercises;

public class CozaLozaWoza{
    final int UPPER_BOUND = 110;


    public CozaLozaWoza(){
        for (int i = 1; i <= UPPER_BOUND; i++){
            if (i % 3 == 0){
                if (i % 5 == 0){
                    System.out.print("CozaLoza ");
                    continue;
                }
                System.out.print("Coza ");
                continue;
            }
            if (i % 5 == 0){
                System.out.print("Loza ");
                continue;
            }
            if (i % 7 == 0){
                System.out.print("Woza ");
                continue;
            }
            if (i % 11 == 0){
                System.out.print(i + " ");
                System.out.println();
                continue;
            }
            System.out.print(i + " ");

        }
    }

}
