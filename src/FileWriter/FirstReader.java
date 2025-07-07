package FileWriter;

import java.io.FileReader;
import java.io.IOException;

public class FirstReader {
    public static void main(String[] args) {
        String fileName = "javaprep.txt";
        try (FileReader reader = new FileReader(fileName)) {
            int read = 0;
            do {

                read = reader.read();
                System.out.println((char)read);
            } while (read != -1);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
