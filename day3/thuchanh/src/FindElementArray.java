//[Thực hành] Tìm giá trị trong mảng

import java.util.Scanner;

public class FindElementArray {
    public static void main(String[] args) {
        while (true) {
            String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor"};

            Scanner scanner = new Scanner(System.in);
            System.out.printf("Enter a name's student: ");
            String input_name = scanner.nextLine();

            boolean isExits = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(input_name)) {
                    System.out.println("Position of the students in the list" + input_name + "is: " + i);
                    isExits = true;
                    break;
                }
            }
            if (!isExits) {
                System.out.println("Not found" + input_name + "in the list.");
            }
        }
    }
}
