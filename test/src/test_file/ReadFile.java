package test_file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        // variable declaration
        int ch;

        // check if File exist or not
        FileReader fr = null;

        try {
            fr = new FileReader("text5.txt");
        }
        catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }

        // read from fFileReader till the end of file
        while ((ch = fr.read()) != -1) {
            System.out.println((char)ch);
        }

        // close the file
        fr.close();
    }
}
