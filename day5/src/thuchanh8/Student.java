package thuchanh8;

//Bước 1: Xây dựng lớp Student, xây dựng phương thức tĩnh change()
public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //hàm khởi tạo để khởi tạo biến
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //phương thức static để thay đổi giá trị của biến static
    static void change() {
        college = "CodeGym";
    }

    //phương thức để hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

}
