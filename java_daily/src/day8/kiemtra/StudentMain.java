package day8.kiemtra;

import java.util.Scanner;

/**
 * Main class
 *
 * @author viettuts.vn
 */
public class StudentMain {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        StudentManager studentManager = new StudentManager();
        int studentId;

        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentManager.add();
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
                    studentManager.show();
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

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Nhap hoc sinh");
        System.out.println("2. In danh sach hoc sinh sap xep theo ten va tuoi");
        System.out.println("3. Xoa hoc sinh theo id.");
        System.out.println("4. Sua hoc sinh theo id.");
        System.out.println("5. Nhap diem va ghi ra file");
        System.out.println("6. Hien thi sanh sach hoc sinh");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
