package kiemtra2v2.view;

import kiemtra2v2.controller.StudentController;
import kiemtra2v2.model.LopHoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Nhap hoc sinh vao cac lop");
        System.out.println("2. In ra danh sach hoc sinh cua cac lop 1A,B,C");
        System.out.println("3. Sua hoc sinh theo ID");
        System.out.println("4. Xoa hoc sinh theo ID");
        System.out.println("5. Tim kiem theo ten da nhap");
        System.out.println("6. In ra danh sach sap xep theo ten");
        System.out.println("7. In ra danh sach theo nam sinh nhap vao");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }

    public static void main(String[] args) {

        // Khởi tạo 1 list danh sách lớp bao gồm (Lớp 1A, Lớp 1B, Lớp 1C),
        // giáo viên chủ nhiệm tương ứng
        // Nguyễn Thị Huyền, Nguyễn Thị Thơm, Nguyễn Thị Lan
         List<LopHoc> classList = new ArrayList<>();

//         classList.add(new LopHoc("1A", "Nguyễn Thị Huyền"));
//         classList.add(new LopHoc("1B", "Nguyễn Thị Thơm"));
//         classList.add(new LopHoc("1C", "Nguyễn Thị Lan"));

        LopHoc lopHoc1 = new LopHoc("1A", "Nguyễn Thị Huyền");
        LopHoc lopHoc2 = new LopHoc("1B", "Nguyễn Thị Thơm");
        LopHoc lopHoc3 = new LopHoc("1C", "Nguyễn Thị Lan");

        classList.add(lopHoc1);
        classList.add(lopHoc2);
        classList.add(lopHoc3);

        String choose = null;
        boolean exit = false;
        StudentController students = new StudentController();

        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    students.addStudent(lopHoc1);
                    students.findAll();
                    break;
                case "2":
                    break;
                case "3":

                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
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
            // show menu
            showMenu();
        }
    }

}
