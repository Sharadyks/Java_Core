package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FirstWrite {
    public static void main(String[] args) {
        String fileName = "javaprep.txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Journey to java");
            writer.flush();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.printf("Exception occured: %s", e.getMessage());
        }


    }
}
