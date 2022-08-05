package thuchanh8.bai1.animal;

import thuchanh8.bai1.edible.Edible;

//public class Chicken extends Animal {
//    @Override
//    public String makeSound() {
//        return "Chicken: Cluck-cook";
//    }
//}

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
