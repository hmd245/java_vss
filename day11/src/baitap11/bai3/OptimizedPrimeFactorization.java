package baitap11.bai3;

import java.util.Scanner;

public class OptimizedPrimeFactorization implements Runnable{
    private String name;

    // Constructor
    public OptimizedPrimeFactorization(String name) {
        this.name = name;
        System.out.println("Khoi tao " + name);
    }

    public boolean check(int n){
        if (n < 2) return false;
        for(int i = 2; i <=Math.sqrt(n) ; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        int count = 0;
        try{
            //Scanner sc = new Scanner(System.in);
            //System.out.print("Nhập vào số nguyên n2 = ");
            //int n = sc.nextInt();
            int n = 20;

            while (count < n){
                if (check(count)) {
                    System.out.print("Toi uu: " + count);
                    System.out.println();
                }
                count++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
