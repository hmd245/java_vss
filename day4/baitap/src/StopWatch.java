import java.time.LocalTime;

//Trường startTime và endTime là private với phương thức getter để trả về giá trị của startTime và endTime.
public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    // Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống.
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // ?????????????????????
//    public StopWatch(long startTime, long endTime) {
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }

    // Phương thức start() để reset startTime về thời gian hiện tại của hệ thống.
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống.
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây
    public long getElapsendTime() {
        long miliSecond = (endTime - startTime);
        return miliSecond;
    }
}

