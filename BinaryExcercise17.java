import java.io.*;

/**
 * Exercise 1: Write 100 random integers to a text file
 * 
 * Requirements:
 * - Create a file named Exercise17_01.txt if it does not exist
 * - If the file already exists, APPEND new data (don't overwrite)
 * - Write 100 integers created randomly (use Math.random())
 * - Integers should be separated by a space
 * - Use text I/O (PrintWriter)
 * 
 * Name: Parth Thite
 * Date: 1/12/2026
 */
public class BinaryExcercise17 {
    
    public static void main(String[] args) throws IOException {
        // TODO: Create a File object for "Exercise17_01.txt"

        File numbers = new File("Exercise17_01.txt");
        
         // Check if file exists
        if (numbers.exists()) {
            System.out.println("File already exists. Appending data.");
        } else {
            System.out.println("File does not exist. Creating new file.");
        }
        
        // TODO: Create PrintWriter in APPEND mode
        // Hint: Use FileWriter with append parameter set to true

        try (FileWriter writer = new FileWriter(numbers, true)) {
            
            // TODO: Generate and write 100 random integers
            // Hint: Use Math.random() to generate random integers
            // Hint: Separate integers with a space

            for (int i = 0; i < 100; i++) {
            int randomNum = ((int)(Math.random() * 101));
            writer.write(randomNum + " ");
            }
        }
        
        
        System.out.println("100 random integers written to Exercise17_01.txt");
    }
}