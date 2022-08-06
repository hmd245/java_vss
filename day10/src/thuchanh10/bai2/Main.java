package thuchanh10.bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Bước 3: Tạo lớp Main và tạo phương thức writeToObject(String path, List<Student> students) để ghi danh sách học viên hiện có vào trong file nhị phân như sau:
public class Main implements Serializable{
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //    Bước 4: Tạo phương thức main trong lớp Main và khai báo một danh sách học viên:
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));

        writeToFile("D:\\workplace\\java_fresher\\java_vss\\day10\\src\\thuchanh10\\bai2\\student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("D:\\workplace\\java_fresher\\java_vss\\day10\\src\\thuchanh10\\bai2\\student.txt");

        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }



    // Bước 6: Tạo phương thức readDataFromFile(String path) trong lớp Main để lấy ra danh sách học viên đang có trong file student.txt
public static List<Student> readDataFromFile(String path){
    List<Student> students = new ArrayList<>();
    try{
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        students = (List<Student>) ois.readObject();
        fis.close();
        ois.close();
    }catch(Exception ex){
        ex.printStackTrace();
    }
    return students;
}


//    Bước 7: Gọi phương thức readDataFromFile trong hàm main và hiển thị danh sách các học viên đang có trong file



}
