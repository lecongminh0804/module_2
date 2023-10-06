package _06_Inheritance.exercise.ex_1;

public class Test {
    public static void main(String[] args) {
        Circle circle= new Circle(5,"blue");
        System.out.println(circle);
        System.out.println("Diện tích tam giác: "+ circle.getArea());

        Cylinder cylinder= new Cylinder(3, "red", 10);
        System.out.println(cylinder);
        System.out.println("Thể tích hình trụ: "+ cylinder.getVolume());
    }
}
