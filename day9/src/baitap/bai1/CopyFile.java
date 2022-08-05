package baitap.bai1;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException{
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            // Tạo instance của class FIleInputStream và FileOutputStream
            // Đường dẫn cho file nguồn và file đích
            inputStream = new FileInputStream(new File("D:\\workplace\\java_fresher\\java_vss\\day9\\src\\baitap\\bai1\\source.txt"));
            outputStream = new FileOutputStream(new File("D:\\workplace\\java_fresher\\java_vss\\day9\\src\\baitap\\bai1\\target.txt"));


            // Cấp phát 1024 byte để chứa nội dung đọc từ file.
            int length;
            byte[] buffer = new byte[1024];

            // copy noi dung file theo byte
            // read() đọc số byte từ lường input và lưu vào mảng buffer
            // phương thức này trả về tổng số byte đọc được, trả về -1 nếu file rỗng
            // write() ghi byte dữ liệu được lưu mảng buffer ra luồng output
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0 , length);
            }
            System.out.println("Da copy thanh cong");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
