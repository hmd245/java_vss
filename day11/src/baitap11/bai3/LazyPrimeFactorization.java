package baitap11.bai3;

import java.util.Scanner;

public class LazyPrimeFactorization implements Runnable {
    // Property
    private Thread t;
    private String name;

    // Constructor
    public LazyPrimeFactorization(String name) {
        this.name = name;
        System.out.println("Khoi tao " + name);
    }

    public boolean check(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        // Tìm số nguyên tố
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Nhập vào số nguyên n = ");
//        int n = sc.nextInt();
//
//        int i = 0, check;
//        while (i < n) {
//            check = isprime(i);
//            if (check == 1) {
//                System.out.print(i + " ");
//            }
//            ++i;
//        }

        int count = 0;
        try {
            //Scanner sc = new Scanner(System.in);
            //sc.nextLine();
            //System.out.print("Nhập vào số nguyên n1 = ");
            //int n = sc.nextInt();
            int n = 10;

            while (count < n) {
                if (check(count)) {
                    System.out.print("ko toi uu: " + count);
                    System.out.println();
                }
                count++;
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Phương thức kiểm tra số nguyên tố
//    private static int isprime(int n) {
//        //flag = 0 => không phải số nguyên tố
//        //flag = 1 => số nguyên tố
//
//        int flag = 1;
//
//        if (n < 2) return flag = 0; /*Số nhỏ hơn 2 không phải số nguyên tố => trả về 0*/
//
//        /*Sử dụng vòng lặp while để kiểm tra có tồn tại ước số nào khác không*/
//        int i = 2;
//        while (i < n) {
//            if (n % i == 0) {
//                flag = 0;
//                break; /*Chỉ cần tìm thấy 1 ước số là đủ và thoát vòng lặp*/
//            }
//            i++;
//        }
//        return flag;
//    }

    // Tạo phương thức start()
//    public void start() {
//        if (t == null) {
//            t = new Thread(this);
//            t.start();
//        }
//    }
}
