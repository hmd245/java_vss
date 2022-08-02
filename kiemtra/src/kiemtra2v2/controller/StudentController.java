package kiemtra2v2.controller;

import kiemtra2v2.model.HocSinh;
import kiemtra2v2.model.LopHoc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    public static Scanner scanner = new Scanner(System.in);

//    public static List<LopHoc> classList = new ArrayList<>();
//    LopHoc lopHoc1 = new LopHoc("1A", "Nguyễn Thị Huyền");
//    LopHoc lopHoc2 = new LopHoc("1B", "Nguyễn Thị Thơm");
//    LopHoc lopHoc3 = new LopHoc("1C", "Nguyễn Thị Lan");

    // constructor
    public StudentController() {
    }

    //nhap name
    private String inputName() {
        System.out.println("Nhap ten hoc sinh: ");
        String name = scanner.nextLine();
        return name;
    }

    // Nhap ngay sinh
    private String inputBirthday() {
        System.out.println("Nhap ngay sinh (dd/mm/yyyy: )");
        String dayOfBirth = scanner.nextLine();
        return dayOfBirth;
    }

    // ham convert String > Date
    public Date stringToDate(String birthDay) {
        Date birthday = new Date(birthDay);
        return birthday;
    }

    // them hoc sinh vao lop
    public void addStudent() {
        String name = inputName();
        String birthDay = inputBirthday();
        HocSinh hocSinh = new HocSinh(name, birthDay);
        //lopHoc1.add(hocSinh);
    }


}
