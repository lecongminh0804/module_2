package _06_Inheritance.exercise.ex_3;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(8,4);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint.move());
    }
}
