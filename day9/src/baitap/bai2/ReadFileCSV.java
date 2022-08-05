package baitap.bai2;

import java.io.*;

public class ReadFileCSV {
    public void readFileCsv(String filePath) {
        try {
            // Doc file theo duong dan
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            // Doc tung dong cua file
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = "";
            while ((line = br.readLine()) != null) {
                String[] result = line.split(",");
                System.out.println(result[2]);

                //System.out.println(line);
            }
            br.close();
        }
        catch (FileNotFoundException e) {
            System.err.println("File khong ton tai hoac noi dung loi");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ReadFileCSV readCsv = new ReadFileCSV();
        readCsv.readFileCsv("D:\\workplace\\java_fresher\\java_vss\\day9\\src\\baitap\\bai2\\test.csv");
    }
}
