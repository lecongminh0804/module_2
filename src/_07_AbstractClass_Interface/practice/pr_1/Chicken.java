package _07_AbstractClass_Interface.practice.pr_1;


public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Ăn được Gà";
    }
}
