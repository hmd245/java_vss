import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        // Tao mot doi tuong InputStream: luong doc mot file
        //InputStream is = new FileInputStream("CodeGym.txt");
        InputStream is = new FileInputStream("D:\\workplace\\java_fresher\\java_vss\\test\\src\\binary_file\\abc.txt");

        int i = -1;

        // Đọc lần lượt các byte 8bit trong luong va lưu vào biến i
        // Khi đọc ra giá trị -1 thì kết thúc luồng
        while ((i = is.read()) != -1) {
            //System.out.println(is.read() + ": " + (char)i );
            System.out.println((char) i);
        }
        is.close();
    }
}
