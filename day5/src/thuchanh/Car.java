package thuchanh;

public class Car {
    private String name;
    //String name;
    private String engine;

    public static int numberOfCars;
    public int count;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
        count++;
    }
}
