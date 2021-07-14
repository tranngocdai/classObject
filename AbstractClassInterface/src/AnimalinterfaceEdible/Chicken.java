package AnimalinterfaceEdible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "CakCak";
    }

    @Override
    public String howToEat() {
        return "anDB";
    }
}
