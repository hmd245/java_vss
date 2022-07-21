import java.time.LocalTime;

//Trường startTime và endTime là private với phương thức getter để trả về giá trị của startTime và endTime.
public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    // Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống.
    public StopWatch() {
        startTime = LocalTime.now();
    }

    // ?????????????????????
    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Phương thức start() để reset startTime về thời gian hiện tại của hệ thống.
    public void start() {
        startTime = LocalTime.now();
    }

    // Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống.
    public void stop() {
        endTime = LocalTime.now();
    }

    // Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây
    public int getElapsendTime() {
        // ?????????????????/
        int miliSecond = ((endTime.getHour() - startTime.getHour()) * 3600 + (endTime.getMinute() - startTime.getMinute()) * 60 + (endTime.getSecond() - startTime.getSecond()) * 1000);
        return miliSecond;
    }


}

