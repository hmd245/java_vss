package baitap11.bai1;

public class NumberGenerator implements Runnable {
    // Property
    private Thread t;
    private String name;

    // Constructor
    public NumberGenerator(String name) {
        this.name = name;
        System.out.println("Khoi tao " + name);
    }

//    private Thread myThread1;
//    private Thread myThread2;

    // Constructor
//    public NumberGenerator() {
//        // Tạo 2 object của class Thread với tham số khởi tạo là 2 đối tượng NumberGenerator.!!!????
//        myThread1 = new Thread(this, "threadName1");
//        System.out.println("Tao my thread1" + myThread1);
//        myThread1.start();
//
//        myThread2 = new Thread(this, "threadName2");
//        System.out.println("Tao my thread2" + myThread2);
//        myThread2.start();
//    }
//
//    public Thread getMyThread1() {
//        return myThread1;
//    }
//
//    public Thread getMyThread2() {
//        return myThread2;
//    }


    // Không dùng đồng bộ
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread "+ name + " so tu nhien: " + i + " hashCode: " + this.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("My thread da bi ngat");
        }
        System.out.println("My thread da ket thuc");
    }

    // Có dùng đồng bộ
//    public synchronized void run() {
//        try {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("In ra 10 so tu nhien dau tien: " + i);
//                //!!!!!??? Thông tin hashCode của bản thân  generator
//                Thread.sleep(500);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("My thread da bi ngat");
//        }
//        System.out.println("My thread da ket thuc");
//    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator("Thread1");
        //numberGenerator1.start();
        NumberGenerator numberGenerator2 = new NumberGenerator("Thread2");
        //numberGenerator2.start();

        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator2);
        thread1.start();
        thread2.start();

        // ???!!!
        thread1.setPriority(Thread.MAX_PRIORITY); // max = 10
        thread2.setPriority(Thread.MIN_PRIORITY); // min = 1

        //System.out.println("Main thread da chay xong");
    }
}
