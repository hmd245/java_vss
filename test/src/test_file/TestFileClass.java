package test_file;

import java.io.File;
import java.util.Formatter;

public class TestFileClass {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("image/us.gif");

        // khong tao duoc file???
        File file1 = new File("test.txt");
        System.out.println("Ten file: " + file1.getName());

        // Tao file test2.txt
        try {
            Formatter file2 = new Formatter("test2.txt");
            file2.format("%s %s %s", "1","John", "Smith \r\n");
            file2.close();
        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");

    }
}
