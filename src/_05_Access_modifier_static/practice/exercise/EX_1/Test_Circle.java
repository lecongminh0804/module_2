package _05_Access_modifier_static.practice.exercise.EX_1;

public class Test_Circle {
    public static void main(String[] args) {
        Circle circle= new Circle(5);
        System.out.println("Circle radius: " + circle.getRadius() + ", color: " + circle.getColor());
        circle.setRadius(10);
        circle.setColor("Black");
        System.out.println("Circle radius: " + circle.getRadius() + ", color: " + circle.getColor());
    }
}
