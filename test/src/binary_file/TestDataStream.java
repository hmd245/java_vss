package binary_file;

import java.io.*;

public class TestDataStream {
    public static void main(String[] args) throws IOException {
        try (
                // Tao mot luong dau ra cho file temp.dat
                DataOutputStream output = new DataOutputStream(new FileOutputStream("D:\\workplace\\java_fresher\\java_vss\\test\\src\\binary_file\\temp.dat"));
                ) {
            //  Viet diem hoc sinh vao file
            output.writeUTF("Anh");
            output.writeDouble(85.25);
            output.writeUTF("Hoa");
            output.writeDouble(75.75);
            output.writeUTF("Nam");
            output.writeDouble(95.5);
        }
        try (
                // Tao mot luong dau vao cho file temp.dat
                DataInputStream input = new DataInputStream(new FileInputStream("D:\\workplace\\java_fresher\\java_vss\\test\\src\\binary_file\\temp.dat"))
                ) {
            // Doc diem hoc sinh tu file
            for (int i = 0; i < 3; i++) {
                System.out.println(input.readUTF() + " " + input.readDouble());
            }

            // Test đọc dữ liệu ở cuối luồng đầu vào (khi hết dữ liệu), ngoại lệ này để phát hiện phần cuối của file.
            for (int i = 0; i < 4; i++) {
                System.out.println(11111);
                System.out.println(input.readUTF() + " " + input.readDouble());
            }

        }
        //
        catch (EOFException ex) {
            System.out.println("Tat ca du lieu da duoc doc");
        }

    }
}
