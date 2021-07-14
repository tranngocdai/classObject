package AnimalinterfaceEdible;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "lozloz";
    }

    @Override
    public String howToEat() {
        return "anCut";
    }
}
