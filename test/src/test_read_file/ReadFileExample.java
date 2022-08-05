package test_read_file;

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

            // Kiem tra neu file khong ton tai thi nem ra ngoai le
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // Doc tung dong cua file va tien hanh cong tong
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tong = " + sum);
        }
        catch (Exception e) {
            // Truong hop file khong ton tai hoac noi dung file loi
            System.out.println("File khong ton tai hoac noi dung loi");
        }
    }

    public static void main(String[] args) {
//        System.out.println("Nhap duong dan file:");
//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();
//        //String path = "D:\\workplace\\java_vss\\test\\src\\test_read_file\\thuchanh1.txt";
        String path = "D:\\workplace\\java_vss\\test\\src\\test_read_file\\thuchanh1v1.txt";

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText(path);

    }
}


