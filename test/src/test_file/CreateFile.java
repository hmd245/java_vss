package test_file;

import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
    public static void main(String[] args) throws IOException {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        String str = "File handing in Java using " +
                "FileWriter and FileReader";

        // attach a file to FileWriter
        FileWriter fw = new FileWriter("output.txt");

        // read character wise from string and write into FileWrite
        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
            //fw.write(5);
            //fw.write('a');
        }
        System.out.println("Writing successful");

        // close the file
        fw.close();
    }
}