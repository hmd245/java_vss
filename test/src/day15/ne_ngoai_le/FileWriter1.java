package day15.ne_ngoai_le;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter1 {
    public static void write(String fileName, String s) throws FileNotFoundException {
        File file = new File(fileName);
        PrintWriter out = new PrintWriter(file);

        out.println(s);
        out.close();
    }

    public static void main(String[] args) {
        try {
            FileWriter1.write("hello.txt", "Hello!");
            FileWriter1.write("D:\\workplace\\java_fresher\\java_vss1111111111error\\hello.txt", "Hello!");
        } catch (Exception e) {
            System.out.println("bat ngoai le sinh ra tu phuong thuc write - PrintWriter");
            e.printStackTrace();
        }
        System.out.println(1111);
    }

}
