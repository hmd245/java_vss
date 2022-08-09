package baitap11.bai2;

public class EvenThread extends Thread{
    private String name;

    public EvenThread(String name) {
        this.name = name;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Thread " + name + " xuat ra cac so chan 1-10: " + i);
                    Thread.sleep(15);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("EvenThread da bi ngat");
        }
        System.out.println("EvenThread da ket thuc");
    }
}
