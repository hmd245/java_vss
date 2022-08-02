package kiemtra2v1.controller;

import kiemtra2.StudentModel;
import kiemtra2.StudentRepo;
import kiemtra2v1.model.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);

    public static List<Student> studentList = new ArrayList<>();

    //??? StudentRepo
    private StudentRepo studentRepo;



    // ArrayList sameName
    List<String> sameName = new ArrayList<>();

    // constructor
    public StudentManager() {
        //!!!!
        studentRepo = new StudentRepo();

    }

    // ??
    public void findAll() {
        for (Student i : studentList) {
            System.out.println(i.toString());
        }
    }

    // nhap name   !!!!xem lai
    private String inputName() {
        char alphabet = 'A';
        System.out.println("Input student name: ");
        String name = scanner.nextLine();
        String formatName = "";
        if (!sameName.contains(name)){
            sameName.add(name);
            return name;
        }
        else {
            int count = 0;
            List<Integer> index = new ArrayList<>();
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getName().equalsIgnoreCase(name)) {
                    index.add(i);
                }
            }
            for (int i = 0; i < index.size(); i++) {
                studentList.get(index.get(i)).setName(name + " " + (char) (alphabet + count));
                count++;
            }
            formatName = name + (char) (alphabet + count);
            return formatName;
        }
    }

    // nhap birthDay
    private String inputBirthDay() {
        System.out.println("Nhap ngay sinh (dd/mm/yyyy): ");
        String dayOfBirth = scanner.nextLine();
        return dayOfBirth;
    }

    // ham convert String > Date
    public Date stringToDate(String birthDay) {
        Date birthday = new Date(birthDay);
        return birthday;
    }

    // Ham them hoc sinh
    public void addStudent() {
        String name = inputName();
        String birthDay = inputBirthDay();
        Student student = new Student(name, birthDay);
        studentList.add(student);
    }

    // ham delete hoc sinh theo maHs
    public void delete (String maHS){
        Student studentDelete = null;
        for (int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getMaHs().equalsIgnoreCase(maHS)){
                studentDelete = studentList.get(i);
                break;
            }
        }
        if (studentDelete != null){
            studentList.remove(studentDelete);
        }else {
            System.out.println("ID not existed!");
        }
    }

    // ham edit hoc sinh theo maHs
    public void edit(String maHs){
        for (int i = 0; i < studentList.size();i++){
            if (studentList.get(i).getMaHs().equalsIgnoreCase(maHs)){
                studentList.get(i).setName(inputName());
                String birthDay = inputBirthDay();
                Date dayOfBirth = stringToDate(birthDay);
                studentList.get(i).setBirthDay(dayOfBirth);
                break;
            }
        }
    }

    // ham nhap diem !!!!!!
    public void inputGradeList(){
        for (int i = 0; i < studentList.size(); i++){
            System.out.printf("Input grade of student id = %s", studentList.get(i).getMaHs());
            studentList.get(i).setGrade(inputGrade());
        }
        //studentRepo.writeFile(studentList);
    }

    private float inputGrade(){
        System.out.println("Input grade : ");
        return Float.parseFloat((scanner.nextLine()));
    }


    // ham sap xep theo name, birthday, id

}
