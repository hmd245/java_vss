package thuchanh8;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCars);

        Car car3 = new Car("Audi1", "Ocsen 1");
        Car car4 = new Car("Audi1", "Ocsen 1");

        System.out.println(Car.numberOfCars);
        System.out.println(car1.numberOfCars); //!?

        //System.out.println(Car.count); // như này là không đúng vì ...!?
        System.out.println(car1.count);
        System.out.println(car2.count);

    }

}

