package day8.thuchanh.bai2;

//[Thực hành] Phân biệt giữa HashMap và HashSet
//Tạo một lớp Student chứa thông tin về tên, tuổi, địa chỉ.
//Sử dụng HashMap và HashSet để lưu các đối tượng Student.
//Hiển thị tất cả thông tin sau khi đã lưu.


public class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student@name=" + name + ",age=" + age + ",address=" + address;
    }
}
