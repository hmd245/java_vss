public class DisplayPrimeLesThan100 {
    public static void main(String[] args) {

        for (int num = 2; num <= 100; num++) {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num %i == 0) {
                    count++;
                }
            }
            if (count == 0 && num > 1)
                System.out.println(num);
        }
    }
}
