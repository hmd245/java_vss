import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10){
            int a;
            int b;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a: ");
            a = scanner.nextInt();

            System.out.println("Enter b: ");
            b = scanner.nextInt();

            // ham abs() tra ve gia tri tuyet doi cua a, b
            a = Math.abs(a);
            b = Math.abs(b);

            if (a == 0 || b == 0) {
                System.out.println("NO greatest common factor");
            }
            while (a != b) {
                if (a > b)
                    a -= b;
                else
                    b -= a;
            }
            System.out.println("Greatest common factor: " + a);
            count++;
            //System.out.println(count);
        }
    }
}
