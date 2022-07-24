package baitap.bai2;

public class Student {
    private String name = "John";
    //String name = "John";
    private String classes = "CO2";

    // Một hàm tạo không có tham số
    public Student() {

    }

    // Hai phương thức có access modifier là public: setName và setClasses
//    public String setName(String name) {
//        return name;
//    }

    // Nếu modifier là private ở đây thì chỉ có thể truy cập trong cùng class chứ package khác không được
//    private String setName(String name) {
//        return name;
//    }

    // Nếu modifier là public, protected, default thì vẫn có thể truy xuất bên lớp TestStudent
    String setName(String name) {
        return name;
    }

    public String setClasses(String classes) {
        return classes;
    }
}
