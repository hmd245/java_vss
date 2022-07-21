//[Bài tập] Tính tổng các số ở một cột xác định

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[][] arrTwoDimension = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

        // Khai bao so dong va cot cua ma tran
        System.out.printf("Nhap dong, cot: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] arrTwoDimension = new int[m][n];

        System.out.println("Nhap " + m + " dong va " + n + " cot: ");
        for (int row = 0; row < m; row++) {
            for (int column = 0; column < n; column++) {
                arrTwoDimension[row][column] = scanner.nextInt();
            }
        }

        // In ra ma tran
        for (int row = 0; row < m; row++) {
            for (int column = 0; column < n; column++) {
                System.out.printf(arrTwoDimension[row][column] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        System.out.println("Nhap cot muon tinh tong 0 / 1 / 2...: ");
        int columnPosition = scanner.nextInt();

        for (int row = 0; row < n; row++) {
            sum += arrTwoDimension[row][columnPosition];
            System.out.println(arrTwoDimension[row][columnPosition]);
        }
//        for (int column = 0; column < 3; column++) {
//            for (int row = 0; row < 3; row++) {
//                sum += arrTwoDimension[row][2];
//                System.out.println(arrTwoDimension[row][2]);
//            }
//        }
        System.out.println(sum);

    }
}
