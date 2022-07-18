import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter number:");

            int number = myObj.nextInt();

            System.out.println(number);

            if(number % 2 == 0) {
                System.out.println(number + "is even");
            }
            else {
                System.out.println(number+ " is odd");
            }
            i++;
        }
    }
}
