package thuchanh.bai1.animal;
import thuchanh.bai1.edible.Edible;
import thuchanh.bai1.fruit.Apple;
import thuchanh.bai1.fruit.Fruit;
import thuchanh.bai1.fruit.Orange;


public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits= new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit1: fruits) {
            System.out.println(fruit1.howToEat());
        }

    }
}
