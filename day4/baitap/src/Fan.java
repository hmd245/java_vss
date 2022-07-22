public class Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(10);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(5);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

    //SLOW,MEDIUM,và FAST với giá trị 1,2,và 3để biểu thị tốc độ quạt.
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    /*
    Trường speed có kiểu số nguyên(private int)để xác định tốc độ quạt,mặc định là SLOW
    Trường on có kiểu private boolean để xác định quạt đang bật hay tắt,mặc định là false(tắt).
    Trường radius có kiểu private double để xác định bán kính quạt,giá trị mặc định là 5
    Trường color có kiểu dữ liệu private String để xác định màu quạt,mặc định là blue
     */
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    //Các getter và setter cho các thuộc tính
    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức khởi tạo không tham số tạo đối tượng fan mặc định
    public Fan() {

    }

    // Phương thức toString()trả về chuỗi chứa thông tin của quạt.Nếu quạt đang ở trạng thái on,
    // phương thức trả về speed,color,và radius với chuỗi “fan is on”.
    // Nếu quạt không ở trạng thái on,phương thức trả về color,radius với chuỗi “fan is off”.

    public String toString() {
        if (on) {
            return speed + " " + color + " " + radius + " fan is on";
        } else {
            return color + " " + radius + " " + " fan is off";
        }
    }
}