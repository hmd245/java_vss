//[Bài tập 1] Ứng dụng chuyển đổi tiền tệ

import java.util.Scanner;

public class ConvertUsdToVnd {
    public static void main(String[] args) {
        float rate = 23000;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter usd:");
        float usd = myObj.nextFloat();

        float vnd = usd * rate;
        System.out.println(String.format("Convert %.2f Usd to %.2f Vnd ", usd, vnd));

    }
}