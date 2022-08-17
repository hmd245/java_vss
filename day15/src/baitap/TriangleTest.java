package baitap;

import java.util.Scanner;

public class TriangleTest {
        static float a;
        static float b;
        static float c;

        // Tuyên bố rằng phương thức Triangle có thể ném ra ngoại lệ
        public TriangleTest (float a, float b, float c) throws Exception {
            this.a = a;
            this.b = b;
            this.c = c;

            if (a <= 0 || b <= 0 || c <= 0) {
                throw new Exception(); // Tạo một đối tượng Exception mới và ném nó tới noi gọi phương thức
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new Exception();
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh a, b, c: ");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        try {
            TriangleTest triangle = new TriangleTest(a, b, c);
            System.out.println(a + " " + b + " " + c + " phù hợp làm 3 cạnh của một tam giác" );
        } catch (Exception e) {
            //e.printStackTrace();
            //e.getMessage();
            System.err.println(a + " " + b + " " + c + " không phải là tam giác");
        }
    }
}
// 3 4 5
// 1 2 3