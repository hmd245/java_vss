public class SumDiagonalLine {
    public static void main(String[] args) {
        int[][] arrTwoDimension = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        for (int row = 0; row < arrTwoDimension.length; row++) {
            for (int column = 0; column < arrTwoDimension[row].length; column++) {
                if (row == column) {
                    sum += arrTwoDimension[row][column];
                }
            }
        }
        System.out.println(sum);
    }
}
