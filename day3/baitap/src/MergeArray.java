//[Bài tập] Gộp mảng

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count <= 3) {

            // Khoi tao 2 mang
            //int[] arr1 = {1, 2, 3};
            //int[] arr2 = {4, 5, 6};

            System.out.printf("Enter size1: ");
            int size1 = scanner.nextInt();

            int[] arr1 = new int[size1];

            int i = 0;
            while (i < size1) {
                System.out.printf("Enter element arr1 " + (i + 1) + ": ");
                arr1[i] = scanner.nextInt();
                i++;
            }
            //System.out.println(i);
            System.out.printf("Enter size2: ");

            int size2 = scanner.nextInt();
            int[] arr2 = new int[size2];

            i = 0;
            while (i < size2) {
                System.out.printf("Enter element arr2 " + (i + 1) + ": ");
                arr2[i] = scanner.nextInt();
                i++;
            }

            // Khoi tao arr3 co kich thuoc bang arr1 + arr2
            int[] arr3 = new int[arr1.length + arr2.length];

            // Copy arr2 va arr2 vao arr3
            System.arraycopy(arr1, 0, arr3, 0, arr1.length);
            System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

            System.out.println(Arrays.toString(arr3));
            count++;
        }
    }
}
