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
    int position = 0; // Give us the final position in the matrix, not in an empty slot.

    public Memory(){
        for (int i = 0; i < 20; i++ ){
            for (int j = 0; j < 10; j++){
                memory[i][j] = "****";
            }
        }
        String option = this.Menu();
        while (! option.equals("e")){
            switch (option) {
                case "ca" -> {
                    this.addProcess("a00");
                }
                case "cs" -> {
                    this.addProcess("s00");
                }
                case "d" -> {
                    int idForDelete = this.IdForDelete();
                    this.DeleteProcess(idForDelete);
                }
            }
            this.printMemory();
            option = this.Menu();
        }
    }
    private void printMemory(){
        for(String[] slot:memory){
            System.out.println(Arrays.toString(slot));
        }
    }
    private void addProcess(String typeOfProcess){
        int length = 0;
        if (typeOfProcess.equals("a00")){
            //Generate an aleatory number between 10 and 20
            length = 10 + random.nextInt(21 - 10);
            typeOfProcess = (id >= 9)? "a0": "a00";
        }
        else if (typeOfProcess.equals("s00")){
            //Generate an aleatory number between 5 and 15
            length = 5 + random.nextInt(16 - 5);
            typeOfProcess = (id >= 9)? "s0": "s00";
        }
        if ((200 - position) >= length){
            int row = position / 10;
            int column = position % 10;
            int[] matrixPosition = {length, row, column}; //gives the initial position of the process
            position += length;
            id++;
            idAndPosition.put(id, matrixPosition);

            int numberOfFiles;
            if (length == 20){
                numberOfFiles = length / 10 ; // Calculate the of rows needed for the process
            }
            else if (length == 10){
                numberOfFiles = 1;
            }
            else{
                numberOfFiles = length / 10 + 1; // Calculate the amount of rows needed for the process
            }
            if (id == 1){ // First process
                for (int i = 0; i < numberOfFiles; i++ ){
                    if (length > 10){ // Put the first ten slots
                        for (int j = 0; j < 10; j++){
                            memory[19 - i][j] = typeOfProcess + id;
                        }
                        length -= 10; // for the other slots, on the next iteration it's not going to enter here
                    }
                    else { // The process is going to be in the first row
                        for (int j = 0; j < length; j++){
                            memory[19 - i][j] = typeOfProcess + id;
                        }
                    }
                }
            }
            else {
                if (length <= (10 - column) ){// If the process can be put in only one row
                    for (int j = 0; j < length; j++){
                        memory[19 - row][j + column] = typeOfProcess + id;
                    }
                }
                else {
                    for (int j = 0; j < (10 - column); j++){
                        // 10 - column are the empty slots on the respective row
                        // on this for we set the slots on the first file
                        memory[19 - row][j + column] = typeOfProcess + id;
                    }
                    // Ask if the rest of the process can be put on a single row
                    if ((length - (10 - column)) <= 10){// The process is set in two rows
                        // Set the rest of the process on the next file
                        for (int j = 0; j < (length - (10 - column)); j++){
                            memory[19 - (row + 1)][j] = typeOfProcess + id;
                        }
                    } // The process is set in three rows
                    else {
                        for (int j = 0; j < 10; j++){
                            // Set the second row
                            memory[19 - (row + 1)][j] = typeOfProcess + id;
                        }
                        for (int j = 0; j < (length - (10 - column) - 10); j++){
                            // 10 - column the first column, and 10 the slots of the second one
                            // So the operation gives us the remaining slots to set in the third row
                            memory[19 - (row + 2)][j] = typeOfProcess + id;
                        }
                    }
                }
            }
        }
        else{
            System.out.println("There is no available space, please delete processes");
            System.out.println("MemoryOverFlowException");
        }
    }
    private void DeleteProcess(int idForDelete){
        /*
        Length of the process I'm going to delete. The row and column of the process
        The row and column where is the next process
         */
        int length = idAndPosition.get(idForDelete)[0];
        int row = idAndPosition.get(idForDelete)[1];
        int column = idAndPosition.get(idForDelete)[2];
        int rowNextProcess;
        int columnNextProcess;
        // If the memory only have 1 process, delete all the process and restart the memory
        if (idForDelete == 1 && idAndPosition.size() == 1){
            position = 0;
            for(int i = 0; i <= 9; i++){
                memory[0][i] = "****";
            }
            for(int i = 0; i <= 9; i++){
                memory[1][i] = "****";
            }
        }
        else {
            rowNextProcess = idAndPosition.get(idForDelete + 1)[1];
            columnNextProcess = idAndPosition.get(idForDelete + 1)[2];
            // If the process is in only one row. 10 - column is the space from the initial position in that row
            if (length <= (10 - column)){
                for(int j = 0; j < length; j++){
                    memory[19 - row][column + j] = "****";
                    this.position -= length; //Update the position for creating new process
                    this.PositionsUpdate(idForDelete,length);
                }// Implementation of the movement of the slots

                // In this for we move the slots corresponding to the same row of the next process.
                // This for it´s perfect
                for (int j = columnNextProcess; j <= 9; j++){
                    this.MemoryMove(rowNextProcess, columnNextProcess + (j - columnNextProcess), length);
                }
                // This for it's for the others rows, it's perfect
                for (int i = (rowNextProcess + 1); i <= 10; i++){
                    for (int j = 0; j <= 9; j++){
                        this.MemoryMove(i, j, length);
                    }
                }
            }
            else{
                this.PositionsUpdate(idForDelete,length); // Update the positions of the next processes
                for(int j = 0; j < (10 - column); j++){ //We can avoid repeat the for loop twice
                    memory[19 - row][column + j] = "****";
                }
                if ((length - (10 - column)) < 10){// If the deleted process was in two rows
                    this.position -= length; // Update the position for creating new process

                    for(int j = 0; j < (length - (10 - column)); j++){
                        memory[19 - (row + 1)][j] = "****";
                    }
                    // Here goes the movement of slots

                    // In this for we move the slots corresponding to the same row of the next process.
                    // This for it´s perfect
                    for (int j = columnNextProcess; j <= 9; j++){
                        this.MemoryMove(rowNextProcess, columnNextProcess + (j - columnNextProcess), length);
                    }
                    // This for it's for the others rows, it's perfect
                    for (int i = (rowNextProcess + 1); i <= 10; i++){
                        for (int j = 0; j <= 9; j++){
                            this.MemoryMove(i, j, length);
                        }
                    }
                }
                else { // The process was in three rows
                    this.position -= length; // Update the position for creating new process
                    for(int j = 0; j < 10; j++){ // Put an entire file with ****
                        memory[19 - (row + 1)][j] = "****";
                    }
                    for(int j = 0; j < (length - (10 -column) - 10); j++){ // Put the rest of the third file
                        memory[19 - (row + 2)][j] = "****";
                    }
                    // Here goes the movement of slots

                    // In this for we move the slots corresponding to the same row of the next process.
                    // This for it´s perfect
                    for (int j = columnNextProcess; j <= 9; j++){
                        this.MemoryMove(rowNextProcess,
                                columnNextProcess + (j - columnNextProcess), length);
                    }
                    // This for it's for the others rows, it's perfect
                    for (int i = (rowNextProcess + 1); i <= 10; i++){
                        for (int j = 0; j <= 9; j++){
                            this.MemoryMove(i, j, length);
                        }
                    }
                }
            }
        }
    }
    private int IdForDelete(){
        System.out.println("Type the id process you want to delete from memory");
        int idForDelete = in.nextInt();
        in.nextLine();
        return idForDelete;
    }
    // Move above a slot a number of times.
    // rowNextProcess and columnNextProcess are the initial point to start the movement. Depends on the election for the
    // deletion process, are the initial position of the next process.
    private void MemoryMove(int rowNextProcess, int columnNextProcess, int length){
        if (columnNextProcess == 0 && rowNextProcess == 0){
            memory[19 - rowNextProcess][0] = memory[19 - rowNextProcess][columnNextProcess];

        }
        else if (length <= columnNextProcess){ // If the deleted process was in a single row
            memory[19 - rowNextProcess][columnNextProcess - length] = memory[19 - rowNextProcess][columnNextProcess];
        }
        else if(length <= (columnNextProcess + 10)){ //If the deleted process was in two rows
            memory[19 - (rowNextProcess - 1)][9 - (length - columnNextProcess) + 1] = memory[19 - rowNextProcess][columnNextProcess];
        }
        else{
            memory[19 - (rowNextProcess - 2)][9 - (length - columnNextProcess - 10 - 1)] = memory[19 - rowNextProcess][columnNextProcess];
        }
    }
    //Update the positions in the HashMap idAndPosition
    // idDeleted is the id of the process deleted and length is its length
    private void PositionsUpdate(int idDeleted, int length){
        for (int i = (idDeleted + 1); i <= idAndPosition.size(); i++){
            // Set the length, row and column of the process
            int currentLength = idAndPosition.get(i)[0];
            int currentRow = idAndPosition.get(i)[1];
            int currentColumn = idAndPosition.get(i)[2];
            // If we can subtract the length and column in the same file
            if (length <= currentColumn){
                int[] currentValue = {currentLength, currentRow, currentColumn - length};
                idAndPosition.put(i, currentValue);
            }
            // If we need to move the position 1 row below
            else if (length <= (currentColumn + 10)){
                int[] currentValue = {currentLength, currentRow - 1, 9 - (length - currentColumn - 1)};
                idAndPosition.put(i, currentValue);
            }
            // If we need to move the position 2 row below
            else {
                int[] currentValue = {currentLength, currentRow - 2,
                        9 - (length - currentColumn - 10 - 1)};
                idAndPosition.put(i, currentValue);
                // We subtract the current column for the first row, 10 for the second, 1 for the
                // change of row between the two and third.
            }
        }
    }
    private void printPosition(){
        System.out.println(this.position);
    }
    private void printHashMap(){
        for (int i = 1; i <= idAndPosition.size(); i++){
            System.out.println("id " + i);
            System.out.println( Arrays.toString(idAndPosition.get(i)));
        }
    }
    private String Menu(){
        System.out.println("-------------");
        System.out.println("Type :");
        System.out.println("ca: Create an application process");
        System.out.println("cs: Create a system process");
        System.out.println("d: Delete a process with its id");
        System.out.println("e: Exit");
        return in.next();
    }
}