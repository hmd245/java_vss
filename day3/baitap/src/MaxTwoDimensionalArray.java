//[Bài tập] Tìm phần tử lớn nhất trong mảng hai chiều

import java.util.Scanner;

public class MaxTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count <= 3) {
            // Khai bao so dong va cot cua ma tran
            System.out.printf("Nhap dong, cot: ");
            int m = scanner.nextInt();
            int n = scanner.nextInt();

            // Khai bao ma tran A co m dong, n cot
            int A[][] = new int[m][n];
            System.out.println("Nhap cac phan tu: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    A[i][j] = scanner.nextInt();
                }
            }

            // Tim phan tu co gia tri lon nhat
            int max = A[0][0];
            int min = A[0][0];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (max < A[i][j]) {
                        max = A[i][j];
                    }
                    if (min > A[i][j]) {
                        min = A[i][j];
                    }
                }
            }
            System.out.println("Phan tu lon nhat: " + max);
            System.out.println("Phan tu nho nhat: " + min);
            count++;
        }
    }
}
