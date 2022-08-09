package baitap11.bai3;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization("Thread1");
        Thread thread1 = new Thread(lazyPrimeFactorization);
        thread1.start();

        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization("Thread2");
        Thread thread2 = new Thread(optimizedPrimeFactorization);
        thread2.start();
    }

}

