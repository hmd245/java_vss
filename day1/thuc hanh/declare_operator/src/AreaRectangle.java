//3 [Thực hành] Sử dụng toán tử

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        float width;
        float height;

        //khai báo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = height * width;
        //System.out.printf("Area is: " + area);
        System.out.printf("Area is: %.2f" , area);
    }
}
