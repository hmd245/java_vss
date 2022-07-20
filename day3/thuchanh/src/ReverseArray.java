//[Thực hành] Đảo ngược các phần tử của mảng

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        // khai bao cac bien, nhap va kiem tra kich thuoc mang
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        // nhap gia tri cho cac phan tu cua mang
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }

        // In ra mang da nhap
        System.out.printf("%-20s%s", "Elements in array:", ""); // %-20s%s ??? format
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // Dao nguoc thu tu cac phan tu trong mang
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 -j] = temp;
        }

        //In ra mang sau khi dao nguoc
        System.out.printf("\n%-20s%s", "Reverse array:", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
