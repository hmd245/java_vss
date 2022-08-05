package thuchanh8;

public class TestStaticMethod {
    public static void main(String[] args) {
        // Gọi phương thức change
        Student.change();

        // Tạo đối tượng
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(112, "Khanh");
        Student s3 = new Student(113, "Nam");

        // Gọi phương thức display
        s1.display();
        s2.display();
        s3.display();
    }
}
