package binary_file;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadByteConsole {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        InputStream is = System.in;
        while (true) {
            System.out.println("Nhap 1 ky tu: ");
            int ch = is.read();
            if (ch == 'q') {
                System.out.println("Hoan thanh!");
                break;
            }
            //scanner.nextLine();

            // Loai bo 2 ky tu \r va \n ????????????
            is.skip(2);
            System.out.println("Ky tu nhan duoc: " +  ch);
            System.out.println("Ky tu nhan duoc: " +  (char)ch);
        }
    }
}
