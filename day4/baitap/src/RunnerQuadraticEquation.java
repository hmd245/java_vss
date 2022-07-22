import java.util.Scanner;

public class RunnerQuadraticEquation {
    public static void main(String[] args) {
        int count = 0;
        while (count < 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a, b, c: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            // Khoi tao mot doi tuong thuoc lop QuadraticEquation
            QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

            System.out.println("Delta = " + quadraticEquation.getDiscriminant());

            if (quadraticEquation.getDiscriminant() > 0) {
                //System.out.println("X1: " + quadraticEquation.getRoot1());
                System.out.println("X1: " + Math.round(quadraticEquation.getRoot1() * 100.0) / 100.0); // lay 2 so sau day phay
                //System.out.println("X2: " + quadraticEquation.getRoot2());
                System.out.println("X2: " + Math.round(quadraticEquation.getRoot2() * 100.0) / 100.0);
            } else if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("X1 = X2 = " + quadraticEquation.getRoot1());
            } else {
                System.out.println("The equation has no roots");
            }
            count++;
        }
    }
}

/* test case:
2 -7 3 : 2 nghiem x1 = 3 ; x2 = 0.5
3 2 5 : vo nghiem
1 -4 4: nghiem kep : x1 = x2 =2
1.0 3 1
1 2.0 1
1 2 3
 */