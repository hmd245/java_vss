import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        int numbers;
//        int num = 3;
//        int status = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        numbers = scanner.nextInt();
//
//        if (numbers >= 1) {
//            System.out.println("The first " + numbers + " primes are: ");
//            System.out.println(2);
//        }
//        for (int i = 2; i <= numbers; ) {
//            for (int j = 2; j <= Math.sqrt(num); j++) {
//                if (num % j == 0) {
//                    status = 0;
//                    break;
//                }
//            }
//            if (status != 0) {
//                System.out.println(num);
//                i++;
//            }
//            status = 1;
//            num++;
//        }

        int count = 0;
        int i = 2;
        while (count < numbers) {
            if (isPrimeNumber(i)) {
                System.out.println(i + "");
                count++;
            }
            i++;
        }
    }
    public static boolean isPrimeNumber(int numbers) {
        if (numbers < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numbers); i++) {
            if (numbers % i == 0) {
                return false;
            }
        }
        return true;
    }
}
