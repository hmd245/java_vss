package thuchanh8.bai2;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> number) {
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (max < number.get(i)) {
                max = number.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadWrireFileExample readWrireFileEx = new ReadWrireFileExample();
//        List<Integer> number = readWrireFileEx.readFileText2("numbers.txt");
        List<Integer> number = readWrireFileEx.readFileText2("D:\\workplace\\java_fresher\\java_vss\\day9\\src\\thuchanh\\bai2\\numbers.txt");

        int maxValue = findMax(number);
        System.out.println(maxValue);
        readWrireFileEx.writeFile("D:\\workplace\\java_fresher\\java_vss\\day9\\src\\thuchanh\\bai2\\result.txt", maxValue);
    }

}
