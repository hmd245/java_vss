import java.util.Scanner;

public class TienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money;
        int month;
        double interestRate;

        System.out.println("Enter money: ");
        money = scanner.nextDouble();

        System.out.println("Enter month: ");
        month = scanner.nextInt();

        System.out.println("Enter interestRate: ");
        interestRate = scanner.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 *month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
