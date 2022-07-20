//[Bài tập] Xoá phần tử khỏi mảng


import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        // b1 Khai bao va khoi tao mang gom N phan tu
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a size array: ");
        size = scanner.nextInt();

        // nhap gia tri cho cac phan tu cua mang
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        // In ra mang da nhap
        System.out.printf("%-40s%s", "Elements in array:", ""); // %-20s%s ??? format
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // Nhap X la phan tu can xoa
        System.out.printf("\nEnter value X need delete: ");
        int x = scanner.nextInt();

        // Tim xem X co xuat hien khong va in ra vi tri cua no.
        for (i = 0; i < array.length; i++) {
            if (array[i] == x) {
                int index_del = i;
                System.out.println("Position index need delete is: " + index_del);
                for (i = index_del; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
            }
        }
        System.out.printf("%-40s%s", "Elements in array after delete x: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
