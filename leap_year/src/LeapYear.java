//6 [Thực hành] Kiểm tra năm nhuận

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a year: ");
            int year = scanner.nextInt();

            boolean isLeapYear = false;

            if(year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapYear = true;
                    }
                }
                else {
                    isLeapYear = true;
                }
            }

            if (isLeapYear) {
                System.out.printf("%d is a leap year\n", year);
            }
            else {
                System.out.printf("%d is Not a leap year\n", year);
            }
        }
    }
}
