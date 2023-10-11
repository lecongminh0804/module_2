package _07_AbstractClass_Interface.practice.pr_1;


public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String howToEat() {
        return "Không ăn được Tiger";
    }
}
