package baitap11.bai2;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread("Thread1", "oddThread1");
        Thread oddThread1 = new Thread(oddThread);
        oddThread1.start();
        // sử dụng join() để cho phép xuất các số lẻ trước mới đến các số chẵn.
        try {
            oddThread1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        EvenThread evenThread = new EvenThread("evenThread2");
        Thread evenThread2 = new Thread(evenThread);
        evenThread2.start();

    }
}
