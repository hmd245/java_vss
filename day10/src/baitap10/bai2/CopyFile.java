package baitap10.bai2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {
    private static void copyFileBinary(File source, File dest) throws IOException {
        // ???? toPath() , Standard...
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    // Copy file sử dụng streams
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            // !!! Xem lại bài day 9 : bài tập 1:  copy file

            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }
        finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Cho phép nhập đường dẫn file nguồn, đích
        // D:\workplace\java_vss\day10\src\baitap10\bai2\source1.txt
        // D:\workplace\java_vss\day10\src\baitap10\bai2\des1.txt
//        System.out.printf("Enter source file:");
//        String sourcePath = in.nextLine();
//        System.out.printf("Enter destination file:");
//        String destPath = in.nextLine();

//        File sourceFile = new File(sourcePath);
//        File destFile = new File(destPath);

        // test fix đường dẫn tuyệt đối
        File sourceFile2 = new File("D:\\workplace\\java_vss\\day10\\src\\baitap10\\bai2\\source1.txt");
        //File sourceFile2 = new File("D:\\workplace\\java_vss\\day10\\src\\baitap10\\bai2\\testSaiDuongDan.txt");
        File destFile2 = new File("D:\\workplace\\java_vss\\day10\\src\\baitap10\\bai2\\des1.txt");

        try {
            //copyFileUsingStream(sourceFile, destFile);
            //copyFileBinary(sourceFile, destFile);

            // test đường dẫn tuyệt đối
            copyFileBinary(sourceFile2, destFile2);

            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }

    }
}
