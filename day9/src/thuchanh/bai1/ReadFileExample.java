package thuchanh.bai1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            // Doc file theo duong dan
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // Doc tung dong cua file va tien hanh cong tong lai
            BufferedReader br = new BufferedReader(new FileReader(file));

            // !!!!!!!!!!!????????????
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum +=  Integer.parseInt(line);
            }
            br.close();

            // Hien thi ra tong cac so nguyen trong file
            System.out.println("Tong = " + sum);

        } catch (Exception e) {
            // Truong hop file khong ton tai hoac noi dung file co loi thi hien thi thong bao
            System.err.println("File khong ton tai hoac noi dung co loi");
        }
    }

    public static void main(String[] args) {
//        D:\workplace\java_fresher\java_vss\day9\src\thuchanh\bai1\th_b1.txt
//        D:\workplace\java_fresher\java_vss\day9\src\thuchanh\bai1\th_b1_file2.txt
        System.out.println("Nhap duong dan file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);
    }
}
