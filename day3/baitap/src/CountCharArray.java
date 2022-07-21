import java.util.Scanner;

public class CountCharArray {
    public static void main(String[] args) {
        // Khai bao mot chuoi va gan gia tri
//        String[] arr = {"a", "b", "b",  "c"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter kich thuoc mang: ");
        int size = scanner.nextInt();

        String[] arr = new String[size];
        int i = 0;
        while ( i < arr.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextLine();
            i++;
        }

        // In ra mang da nhap
        for (int j = 0; j < arr.length; j++) {
            System.out.printf(arr[j] + " ");
        }

        //Nhap vao ky tu can dem
        i = 0;
        String c = "b";
        int count = 0;
        for (i = 0; i < arr.length; i++) {
            if (c.equals(arr[i]) ) {
                count++;
            }
        }
        System.out.println("\nSo lan xuat hien: "+ count);

    }
}
