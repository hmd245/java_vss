package thuchanh11.bai3;

public class Count implements Runnable {
    // Property
    private Thread myThread;

    // Construcstor
    public Count() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println("tao my thread " + myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int  i = 0; i < 10; i++) {
                System.out.println("In ra so dem: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
            System.out.println("my thread da bi ngat");
        }
        System.out.println("my thread da ket thuc");
    }
}
