package day15.ne_ngoai_le;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
    public static void write(String fileName, String s) {
        try {
            File file = new File(fileName);
            PrintWriter out =  new PrintWriter(file);

            out.println(s);
            out.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
