package april21exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        try {
            File myObj = new File("src/april21exercise3/testFileWithWords");
            Scanner input = new Scanner(myObj);
            int count = 0;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                for (String word : line.split(" ")) {
                    if (word.length() > 0) count++;
                }
            }
            input.close();
            System.out.printf("Number of words in file: %d", count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
