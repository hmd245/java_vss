package thuchanh11.bai2;
//package thuchanh11.bai2;

import java.util.Random;

import static thuchanh11.bai2.Main.DISTANCE;
import static thuchanh11.bai2.Main.STEP;

public class Car implements Runnable {
    // Property
    private String name;

    // Constructor

    public Car(String name) {
        this.name = name;
    }

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        // Khởi tạo điểm start(hay số km bắt đầu)
        int runDistance = 0;
        // Khởi tạo thời gian cuộc đua
        long startTime = System.currentTimeMillis();

        // Kiểm tra còn xe chưa kết thúc thì tiếp tục chạy
        while (runDistance < DISTANCE) {
            try{
                // Khởi tạo vận tốc ngẫu nhiên
                int speed = (new Random()).nextInt(20);
                // ???!!!Tính khoảng cách đã đi được = kc hiện tại + vận tốc ngẫu nhiên
                runDistance += speed;
                // Xây dựng đồ họa quãng đường xe chạy
                String log = "|";

//                !!!!!!!!!! Nếu mà viết như này thì percentTravel = 0
//                int percentTravel = (runDistance/DISTANCE) * 100;
//                System.out.println(percentTravel);

                int percentTravel = (runDistance * 100) / DISTANCE;
                //System.out.println(percentTravel);

                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ":" + log + " " +
                        Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000); // có thể sinh ra ngoại lệ

            }
            catch (InterruptedException e) {
                //throw new RuntimeException(e); // !!!???mặc định khi add bằng Alt + Enter
                System.out.println("Car" + this.name + "broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car " + this.name + "Finish in " +
                        (endTime - startTime) / 1000 + "s");
    }
}
