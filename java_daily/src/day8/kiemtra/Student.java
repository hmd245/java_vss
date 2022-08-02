package day8.kiemtra;

//Lớp này để lưu thông tin cho mỗi sinh viên.

public class Student implements Comparable <Student> {
    // property
    private int id = 1;
    private String name;
    private int age;

    // constructor
    public Student() {
        id++;

    }

    public Student(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters, setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Override
    public String toString() {
        return "Student@name=" + name + ",age=" + id + ",address=" + age;
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }

}
