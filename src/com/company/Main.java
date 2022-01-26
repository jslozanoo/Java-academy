package com.company;


import Challenge0.Memory;


public class Main {


    public static void main(String[] args) {
        Memory memory = new Memory();
        String option = memory.Menu();

        while (! option.equals("e")){
            switch (option){
                case "ca":
                    memory.AddAppProcess();
                    break;
                case "cs":
                    memory.AddSystemProcess();
                    break;
                case "d":
                    int idForDelete = memory.IdForDelete();
                    memory.DeleteProcess(idForDelete);
                    break;
            }
            memory.printMemory();
            option = memory.Menu();
        }
    }
}

