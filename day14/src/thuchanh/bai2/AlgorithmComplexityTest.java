package thuchanh.bai2;

import java.util.Scanner;

//Bước 1: Tạo lớp AlgorithmComplexityTest, viết hàm main cho phép nhập vào một chuỗi ký tự
public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        //Bước 2: Tính tần suất xuất hiện của các ký tự trong chuỗi vừa nhập
        int[] frequentChar = new int[255];                         //{1}
        for (int i = 0; i < inputString.length(); i++) {           //{2}
            /* Tìm ví trí tương ứng của ký tự trong bảng ASCII */
            int ascii = (int) inputString.charAt(i);               //{3}
            /* Tăng giá trị tần suất */
            frequentChar[ascii] += 1;                              //{4}
            System.out.println("frequentChar[ascii]: " + inputString.charAt(i) + " : " + frequentChar[ascii]);
        }

        //Bước 3:  Tìm ký tự có tần suất xuất hiện nhiều nhất
        int max = 0;                                             //{5}
         char character = (char) 255; /* empty character */      //{6}
         for (int j = 0; j < 255; j++) {                         //{7}
             if (frequentChar[j] > max) {                        //{8}
                 max = frequentChar[j];                          //{9}
                 character = (char) j;                           //{10}
             }
         }
         System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");

        //Tính độ phức tạp của thuật toán vừa triển khai
        //Độ phức tạp của thuật toán cũng chính là thời gian thực hiện chuỗi lệnh {1}, {2}, {5}, {6}, {7}, và được tính bằng thời gian thi hành lệnh lâu nhất trong chuỗi lệnh.
        //Ta sẽ có 2 trường hợp
        //TH1: n <= 255
        //Khi đó độ phức tạp của thuật toán  sẽ là thời gian thực hiện lệnh {7} và bằng O(255)
        //TH2: n> 255
        //Khi đó độ phức tạp của thuật toán  sẽ là thời gian thực hiện lệnh {2} và bằng O(n)

    }
}