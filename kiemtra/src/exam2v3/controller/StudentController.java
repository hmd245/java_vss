package exam2v3.controller;

import exam2v3.Interface.interfaceStudent;
import exam2v3.model.ClassRoom;
import exam2v3.model.Student;
import exam2v3.view.ViewStudent;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController implements interfaceStudent {
    public static Scanner scanner = new Scanner(System.in);

    // property
    public ViewStudent view = new ViewStudent();
    List<ClassRoom> classRoomList = new ArrayList<ClassRoom>();
    public static List<Student> studentList = new ArrayList<Student>();

    //constructor
    public StudentController(ViewStudent view) {
        //???!!!
        // this.view = view;
    }

    // check is number !!!!!!!!!!!!!
    ClassRoom room1 = new ClassRoom("1A", "Nguyen Thi Huyen");
    ClassRoom room2 = new ClassRoom("1B", "Nguyen Thi Thom");
    ClassRoom room3 = new ClassRoom("1C", "Nguyen Thi Lan");


    @Override
    public void enterStudent() {
        String choose = null;
        boolean exit = false;
        classRoomList.add(room1);
        classRoomList.add(room2);
        classRoomList.add(room3);
        while (true) {
            view.showMenu();
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    try {
                        setStudentInfo();
                        break;
                    } catch (ParseException e) {
                        throw new RuntimeException();
                    }
                case "2":
                    getStudentInfo();
                    break;
                case "3":
                    editStudent();
                    break;
                case "4":
                    deleteStdudent();
                    break;
                case "5":
                    serachStudentByName();
                    break;
                case "6":
                    sortByNameStudent();
                    break;
                case "7":
                    searchStudentByBirthDay();
                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
        }

    }

    // Nhap hoc sinh vavo lop
    public void setStudentInfo() throws ParseException {
        System.out.println("Danh sach lop: ");
        for (ClassRoom classRoom : classRoomList) {
            System.out.println("ID: " + classRoom.getIdClass() + " | Ten lop: " + classRoom.getClassName() + " | Ten giao vien: " + classRoom.getTeachName());
        }

        int numberStudent;
        int day;
        int month;
        int year;

        do {
            System.out.print("Nhap so luong hoc sinh: ");
            numberStudent = scanner.nextInt();
            if (numberStudent <= 0) {
                System.out.print("So luong hoc sinh > 0");
                continue;// !!!!!!!!?
            }
            scanner.nextLine();
            int count = 0;
            while (count < numberStudent) {
                Student student = new Student();
                System.out.print("Hoc sinh " + (count + 1) + ":");
                System.out.print("\nTen hoc sinh: ");
                String name = scanner.nextLine();

                System.out.print("Ngay: ");
                day = scanner.nextInt();

                System.out.printf("Thang: ");
                month = scanner.nextInt();

                System.out.printf("Nam: ");
                year = scanner.nextInt();

                String dateBirthDay = day + "/" + month + "/" + year;
                student.setStudentName(name);
                student.setBirthDay(dateBirthDay);

                int choose = 0;
                System.out.println("1: 1A");
                System.out.println("2: 1B");
                System.out.println("3: 1C");
                System.out.println("Chon mot lop de nhap hoc sinh vao: ");
                choose = scanner.nextInt();
                scanner.nextLine();

                switch (choose) {
                    case 1:
                        student.setClassRoom(classRoomList.get(0));
                        break;
                    case 2:
                        student.setClassRoom(classRoomList.get(1));
                        break;
                    case 3:
                        student.setClassRoom(classRoomList.get(3));
                        break;
                    default:
                        System.out.println("Lua chon khong hop le");
                        break;
                }
                studentList.add(student);
                count++;
            }
        } while (numberStudent <= 0);
    }

    @Override
    public void getStudentInfo() {
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    @Override
    public void editStudent() {
        System.out.printf("Nhap vao id cua hoc sinh can sua: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getIdStudent() == id) {
                System.out.printf("Nhap lai ten hoc sinh: ");
                String name = scanner.nextLine();
                System.out.printf("Nhap lai ngay sinh: ");
                int day = scanner.nextInt();
                System.out.printf("Nhap lai thang sinh: ");
                int month = scanner.nextInt();
                System.out.printf("Nhap lai nam sinh: ");
                int year = scanner.nextInt();

                String dateBirthDay = day + "/" + month + "/" + year;
                studentList.get(i).setStudentName(name);
                studentList.get(i).setBirthDay(dateBirthDay);
                System.out.printf("Da sua ten hoc sinh thanh cong");
            }
        }
    }

    @Override
    public void deleteStdudent() {

    }

    @Override
    public List<Student> serachStudentByName() {
        return null;
    }

    @Override
    public void sortByNameStudent() {

    }

    @Override
    public void searchStudentByBirthDay() {

    }


}
