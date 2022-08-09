package baitap11.bai2;

public class OddThread extends Thread {
    private String name;

    public OddThread(String name, String name1) {
        super(name);
        this.name = name1;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println("Thread " + name + " xuat ra cac so le tu 1-10: " + i);
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("OddThread da bi ngat");
        }
        System.out.println("OddThread da ket thuc");
    }
}

