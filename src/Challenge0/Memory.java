package Challenge0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Memory {
    Random random = new Random();
    Scanner in = new Scanner(System.in);
    String[][] memory = new String[20][10];
    HashMap<Integer, int[]> idAndPosition = new HashMap<>();
    int id = 0;
    int position = 0; // Take care with this variable, give us the position in the matrix

    public Memory(){
        for (int i = 0; i < 20; i++ ){
            for (int j = 0; j < 10; j++){
                memory[i][j] = "****";
            }
        }
    }
    public String[][] printMemory(){
        for(String[] slot:memory){
            System.out.println(Arrays.toString(slot));
        }
        return memory;
    }

    public String[][] AddAppProcess(){ //First for application process
        //Generate an aleatory number between 10 and 20
        int length = 10 + random.nextInt(21 - 10);
        int row = position / 10;
        int column = position % 10 ; //Add 1 for located in an empty slot
        int[] matrixPosition = {length, row, column};
        position += length;
        id++;

        idAndPosition.put(id, matrixPosition);

        int numberOfFiles = 0;
        if (length == 20){
            numberOfFiles = length / 10 ; // Calculate the of rows needed for the process
        }
        else if (length == 10){
            numberOfFiles = 1;
        }
        else{
            numberOfFiles = length / 10 + 1; // Calculate the of rows needed for the process
        }
        if (id == 1){ // First process
            for (int i = 0; i < numberOfFiles; i++ ){
                if (length > 10){ // Put the first ten slots
                    for (int j = 0; j < 10; j++){
                        memory[19 - i][j] = "a00" + id;
                    }
                    length -= 10; // for the other slots
                }
                else {
                    for (int j = 0; j < length; j++){
                        memory[19 - i][j] = "a00" + id;
                    }
                }
            }
        }
        else {
            if (length <= (10 - column) ){
                for (int j = 0; j < length; j++){
                    memory[19 - row][j + column] = "a00" + id;
                }
            }
            else {
                for (int j = 0; j < (10 - column); j++){
                    // 10 - column are the empty slots on the respective row
                    // on this for we set the slots on the first file
                    memory[19 - row][j + column] = "a00" + id;
                }
                // Ask if the rest of the process can be put on a single row
                if ((length - (10 - column)) <= 10){
                    // Set the rest of the process on the next file
                    for (int j = 0; j < (length - (10 - column)); j++){
                        memory[19 - (row + 1)][j] = "a00" + id;
                    }
                } // If the process can't be put on a single row
                else {
                    for (int j = 0; j < 10; j++){
                        // Set the entire file
                        memory[19 - (row + 1)][j] = "a00" + id;
                    }
                    for (int j = 0; j < (length - (10 - column) - 10); j++){
                        // 10 - column the first column, and 10 the slots of the second one
                        // So the operation gives us the remaining slots to set
                        memory[19 - (row + 2)][j] = "a00" + id;
                    }
                }
            }
        }
        return memory;
    }

    public String[][] AddSystemProcess(){
        //Generate an aleatory number between 5 and 15
        int length = 5 + random.nextInt(16 - 5);

        int row = position / 10;
        int column = position % 10 ; //Add 1 for located in an empty slot
        int[] matrixPosition = {length, row, column};
        position += length;
        id++;
        idAndPosition.put(id, matrixPosition);
        /*
        System.out.println(Arrays.toString(idAndPosition.get(id)));
        System.out.println("The process length is " + length);
        System.out.println("The row is " + row);
        System.out.println("The column is " + column);
        */
        int numberOfFiles = (length == 10) ? 1 : length / 10 + 1;


        if (id == 1){ // First process
            for (int i = 0; i < numberOfFiles; i++ ){
                if (length > 10){ // Put the first ten slots
                    for (int j = 0; j < 10; j++){
                        memory[19 - i][j] = "s00" + id;
                    }
                    length -= 10; // for the other slots
                }
                else {
                    for (int j = 0; j < length; j++){
                        memory[19 - i][j] = "s00" + id;
                    }
                }
            }
        }
        else {
            if (length <= (10 - column) ){ // If the process can be put on the same row as the previous
                for (int j = 0; j < length; j++){
                    memory[19 - row][j + column] = "s00" + id;
                }
            }
            else {
                for (int j = 0; j < (10 - column); j++){
                    // 10 - column are the empty slots on the respective row
                    // on this for we set the slots on the first file
                    memory[19 - row][j + column] = "s00" + id;
                }
                // Ask if the rest of the process can be put on a single row
                if ((length - (10 - column)) <= 10){
                    // Set the rest of the process on the next file
                    for (int j = 0; j < (length - (10 - column)); j++){
                        memory[19 - (row + 1)][j] = "s00" + id;
                    }
                } // If the process can't be put on a single row
                else {
                    for (int j = 0; j < 10; j++){
                        // Set the entire file
                        memory[19 - (row + 1)][j] = "s00" + id;
                    }
                    for (int j = 0; j < (length - (10 - column) - 10); j++){
                        // 10 - column the first column, and 10 the slots of the second one
                        // So the operation gives us the remaining slots to set
                        memory[19 - (row + 2)][j] = "s00" + id;
                    }
                }
            }
        }
        return memory;
    }
    public String[][] DeleteProcess(int idForDelete){
        int length = idAndPosition.get(idForDelete)[0];
        int row = idAndPosition.get(idForDelete)[1];
        int column = idAndPosition.get(idForDelete)[2];
        int rowNextProcess = idAndPosition.get(idForDelete + 1)[1];
        int columnNextProcess = idAndPosition.get(idForDelete + 1)[2];

        if (length <= (10 - column)){ // If the process is in only one row. 10 - column are the space from the initial position in that row
            for(int j = 0; j < length; j++){
                memory[19 - row][column + j] = "****";
            }// Implementation of the movement of the slots
            // this.MemoryMove(rowNextProcess, columnNextProcess, length);
            // In this for we move the slots corresponding to the same row of the next process.
            // This for it´s perfect
            for (int j = columnNextProcess; j <= 9; j++){
                System.out.println("the iteration is " + j);
                this.MemoryMove(rowNextProcess, columnNextProcess + (j - columnNextProcess), length);
            }
            // This for it's for the others rows, it's perfect
            // Implement for the other two cases


            for (int i = (rowNextProcess + 1); i <= 10; i++){
                for (int j = 0; j <= 9; j++){
                    this.MemoryMove(i, j, length);
                }
            }
        }
        else{
            for(int j = 0; j < (10 - column); j++){ //We can avoid repeat the for loop twice
                memory[19 - row][column + j] = "****";
            }
            if ((length - (10 - column)) < 10){// If the deleted process was in two rows

                for(int j = 0; j < (length - (10 - column)); j++){
                    memory[19 - (row + 1)][j] = "****";
                }
                // Here goes the movement of slots
                this.MemoryMove(rowNextProcess, columnNextProcess, length);
            }
            else { // The process was in three rows
                for(int j = 0; j < 10; j++){ // Put an entire file with ****
                    memory[19 - (row + 1)][j] = "****";
                }
                for(int j = 0; j < (length - (10 -column) - 10); j++){ // Put the rest of the third file
                    memory[19 - (row + 2)][j] = "****";
                }
                // Here goes the movement of slots
                this.MemoryMove(rowNextProcess, columnNextProcess, length);
                //
            }
        }
        return memory;
    }
    public String Menu(){
        System.out.println("-------------");
        System.out.println("Type :");
        System.out.println("ca: Create an application process");
        System.out.println("cs: Create a system process");
        System.out.println("d: Delete a process with its id");
        System.out.println("e: Exit");
        String option = in.next();
        return option;
    }
    public int IdForDelete(){
        System.out.println("Type the id procces you want to delete from memory");
        int idForDelete = in.nextInt();
        in.nextLine();
        return idForDelete;
    }
    // Move above a slot a number of times.
    // rowNextProcess and columnNextProcess are the initial point to start the movement. Depends on the election for the
    // deletion process, are the initial position of the next process.
    public void MemoryMove(int rowNextProcess, int columnNextProcess, int length){
        System.out.println("The row is" + rowNextProcess + " " + "The column is " + columnNextProcess);
        System.out.println("The length is " + length);
        if (length <= columnNextProcess){ // If the deleted process was in a single row
            System.out.println("Error 1");
            memory[19 - rowNextProcess][columnNextProcess - length] = memory[19 - rowNextProcess][columnNextProcess];
        }
        else if(length <= (columnNextProcess + 10)){ //If the deleted process was in two rows
            System.out.println("Error 2");
            memory[19 - (rowNextProcess - 1)][9 - (length - columnNextProcess) + 1] = memory[19 - rowNextProcess][columnNextProcess];
        }
        else{
            System.out.println("Error 3");
            memory[19 - (rowNextProcess - 2)][9 - (length - columnNextProcess - 10 + 1)] = memory[19 - rowNextProcess][columnNextProcess];
        }
    }
}
