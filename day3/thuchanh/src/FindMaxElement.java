//[Thực hành] Tìm giá trị lớn nhất trong mảng

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        // Khai bao cac bien, nhap va kiem tra kich thuoc mang
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        // Nhap gia tri cho cac phan tu cua mang
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.printf("Enter element"  + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        // In ra danh sach tai san da nhap
        System.out.printf("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.printf(array[j] + "\t");
        }

        // Duyet cac phan tu trong mang de tim GTLN
        int max = array[0];
        int index = 1;
        for (int j = 0; j< array.length; j++) {
            if (array[j] > max)
                max = array[j];
            index =  j + 1;
        }
        System.out.println("\nThe largest property value in the list is " + max + " at position " + index );
    }
}
