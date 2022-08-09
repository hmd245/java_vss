package thuchanh11.bai3;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getMyThread().isAlive()) {
                System.out.println("Main thread van song cho den khi child thread song");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
            System.out.println("Main thread da ngat");
        }
        System.out.println("Main thread da chay xong");
    }
}
