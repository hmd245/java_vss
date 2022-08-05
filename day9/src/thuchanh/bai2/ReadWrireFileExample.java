package thuchanh.bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWrireFileExample {

    public List<Integer> readFileText2(String filePath) {
        List<Integer> numbers = new ArrayList<>();

        try {
            // Doc file theo duong dan
            File file2 = new File(filePath);

            if (!file2.exists()) {
                throw new FileNotFoundException();
            }

            // Doc tung dong cua file va tim so lon nhat
            BufferedReader br = new BufferedReader(new FileReader(file2));

            String line = "";
            int max = 0;
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));

                 max = numbers.get(0);
                for (int i = 0; i < numbers.size(); i++) {
                    if (max < numbers.get(i)) {
                        max = numbers.get(i);
                    }
                }
            }

            br.close();

            // Hien thi so lon nhat
            System.out.println(max);

        }
        catch (Exception e) {
            // Th file khong ton tai hoac noi dung loi
            System.err.println("File khong ton tai hoac noi dung loi");
        }
        return numbers;
    }

    // Ghi max vao file
    public void writeFile (String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Gia tri lon nhat la: " + max);
            bufferedWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String path = "D:\\workplace\\java_fresher\\java_vss\\day9\\src\\thuchanh\\bai2\\th_b2_file1.txt";

        ReadWrireFileExample readWrireFileEx = new ReadWrireFileExample();
        readWrireFileEx.readFileText2(path);
    }

}
