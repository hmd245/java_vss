import java.util.Scanner;

public class DisplayShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle triangle");
            System.out.println("2. Draw the  square triangle botton-left");
            System.out.println("3. Draw the  square triangle  top-left            ");
            System.out.println("4. Draw the  isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Draw the squate triangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* " + i + "," + j);
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Draw the top-left triangle");
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    int hight = 5;
                    int k = 0;

                    System.out.println("Draw the isosceles triangle");

                    //cach 1
                    for (int i = 1; i <= hight; ++i, k = 0) {
                        System.out.print("      ");

                        for (int j = 1; j <= hight - i; ++j) {
                            System.out.print("...");
                        }
                        for (k = 0; k != 2 * i -1; k++) {
                            System.out.print(" * ");
                        }
                        System.out.println(",,,");
                    }

                    //cach2:
                    //System.out.println("Nhập vào chiều cao của kim tự tháp: ");
                    //hight = scanner.nextInt();
                    hight = 6;
                    for (int i = 1; i <= hight; ++i, k = 0) {
                        System.out.print("   ");

                        for (int space = 1; space <= hight - i; ++space) {
                            System.out.print("   ");
                        }
                        while (k != 2 * i - 1) {
                            System.out.print(" * ");
                            ++k;
                        }
                        System.out.println();
                    }

                    // cach 3:
                    hight = 7;
                    for (int i = 1; i <= hight; i++) {
                        for (int j = 1; j <= 2 * hight; j++) {
                            if (Math.abs(hight - j) <= (i - 1)) {
                                System.out.print(" * ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println("");
                    }

                    for (int i = 1; i <= 3; i++) {
                        System.out.print("               ");

                        for (int j = 1; j <= 3; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
