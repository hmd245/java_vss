package day8.kiemtra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);
    //private List<Student> studentList ;
    List<Student> studentList = new ArrayList<Student>();

    //Student student1 = new Student(1, "Duc", 22);

    // Them hoc sinh vao studentList
    public void add() {
        int id = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
        System.out.println("student id = " + id);

        String name = inputName();
        int age = inputAge();

        Student student = new Student(id, name, age );
        //studentList.add(student1);
        studentList.add(student);
    }

    // Xoa hoc sinh theo id !!!!!!!!!!!!!
    public void delete(int id) {
        Student student = null;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == id) {
                student = studentList.get(i);
                break;
            }
        }
        if (student != null) {
            studentList.remove(student);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }

    // Edit hoc sinh theo id
    public void edit(int id) {
        boolean isExisted = false;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getId() == id) {
                isExisted = true;
                studentList.get(i).setName(inputName());
                studentList.get(i).setAge(inputAge());
                break;
            }
        }
    }


    // Nhap diem va ghi file


    // Hien thi danh sach sinh vien
    public void show() {
        for (Student student : studentList) {
            System.out.format("%20s | ", student.getName() + student.getId());
            System.out.format("%5d | ", student.getAge());
            System.out.println("");
        }
    }


    // nhap name
    private String inputName() {
        System.out.print("Input student name: ");
        scanner.nextLine(); // để bắt kí tự enter bị thừa
        return scanner.nextLine();
    }

    // nhap age
    private int inputAge() {
        System.out.print("Nhap tuoi hoc sinh: ");
        return scanner.nextInt();
    }

    // getter && setter
//    public List<Student> getStudentList() {
//        return studentList;
//    }
//
//    public void setStudentList(List<Student> studentList) {
//        this.studentList = studentList;
//    }



}
