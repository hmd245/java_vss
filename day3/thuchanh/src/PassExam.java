//[Thực hành] Ứng dụng đếm số lượng sinh viên thi đỗ

import java.util.Scanner;

public class PassExam {
    public static void main(String[] args) {
        // b1 Khai bao cac bien, nhap va kiem tra kich thuoc mang
        int size;
//        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30);

        // b2 Nhap gia tri cho cac phan tu cua mang
        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        // b3 In ra mang, dem so sinh vien pass
        int count = 0;
        System.out.println("List of mark: ");
        for (i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
            if (array[i] >= 5 && array[i] < 10) {
                count++;
            }
        }
        System.out.println("\nThe number of students passing the exam is: " + count);
    }
}
