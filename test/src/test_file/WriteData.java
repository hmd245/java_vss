package test_file;

import java.io.IOException;

public class WriteData {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("scores.txt");

        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // Ghi vao file
        output.print("Hoang Minh Duc ");
        output.println(101);
        output.print("Nguyen Viet Anh ");
        output.println(27);

        // Close file
        output.close();
    }
}
