package binary_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        // Tao mot luong ky tu dau ra de ghi thong tin vao file
        OutputStream os = new FileOutputStream("D:\\workplace\\java_fresher\\java_vss\\test\\src\\binary_file\\abc.txt");

        // Tao mot mang byte, de ghi vao file abc.text
        byte[] bytes = new byte[] {'C', 'o', 'd', 'e'};

        // Ghi lan luot cac ky tu vao luong
        for (int i = 0; i < bytes.length; i++) {
            os.write(bytes[i]);
        }
        // dong luong dau ra khi viec ghi xuong file hoan tat
        os.close();

    }
}
