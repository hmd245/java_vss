//[Bài tập] Thêm phần tử vào mảng


import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //b1 Khai bao va khoi tao mang so nguyen gom N phan tu cho truoc
        int[] myArray = new int[10];
        myArray[0] = 10;
        myArray[1] = 4;
        myArray[2] = 6;
        myArray[3] = 7;
        myArray[4] = 8;

        //b2 Nhap X la so can chen
        System.out.print("Enter X need insert: ");
        int x = scanner.nextInt();

        //b3 Nhap vi tri index can chen
        System.out.print("ENter index need insert: ");
        int index_add = scanner.nextInt();

        //b4 Neu index <= -1 va index >= array.length - 1 thi hien thi khong chen duoc
        if (index_add <= -1 || index_add >= myArray.length) {
            System.out.println("Unable to insert element into array.");
        }

        // In ra mang da nhap
        System.out.printf("%-60s%s", "Elements in array:", ""); // %-20s%s ??? format
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j] + "\t");
        }

        //b5 Thuc hien chen
        for (int i = 9; i > index_add; i--) {
            myArray[i] = myArray[i - 1];
        }
        myArray[index_add] = x;

        System.out.printf("%-60s%s", "\nElements in array after delete x: ", "");
        for (int j = 0; j < myArray.length; j++) {
            System.out.print(myArray[j] + "\t");
        }
    }
}
