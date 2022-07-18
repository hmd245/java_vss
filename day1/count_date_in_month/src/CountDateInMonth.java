//import java.util.Scanner;
//
//public class CountDateInMonth {
//    public static void main(String[] args) {
//        int a = 1;
//        while(a > 0) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Which mont that you want to count days?");
//            int month = scanner.nextInt();
//
//            switch (month) {
//                case 2:
//                    System.out.println("The month 2 has 28 or 29 days!");
//                    break;
//                case 1, 3, 5, 7, 8, 10, 12:
//                    System.out.println("The month " + month + " has 31 days!");
//                    break;
//                case 4, 6, 9, 11:
//                    System.out.println("The month " + month + " has 30 days!");
//                    break;
//                default:
//                    System.out.println("Invalid input!");
//                    break;
//            }
//        }
//    }
//}

import java.util.Scanner;

public class CountDateInMonth {
    public static void main(String[] args) {
        int a = 1;
        while(a > 0) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Which month that you want to count days?");
            int month = scanner.nextInt();

            String daysInMonth= "";

            switch (month) {
                case 2:
                    daysInMonth = "28 or 29";
                    break;
                case 1, 3, 5, 7, 8, 10, 12:
                    daysInMonth = "31";
                    break;
                case 4, 6, 9, 11:
                    daysInMonth = "30";
                    break;
                default:
//                    System.out.println("Invalid input!");
//                    break;
                    daysInMonth = "";
            }

            if (!daysInMonth.equals(""))
                System.out.printf("The month '%d' has %s days!\n", month, daysInMonth);
            else System.out.print("Invalid input!\n");
        }
    }
}





