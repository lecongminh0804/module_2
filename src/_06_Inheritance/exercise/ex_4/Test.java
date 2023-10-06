package _06_Inheritance.exercise.ex_4;
public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0,"Red");
        System.out.println("Diện tích tam giác: " + triangle.getArea());
        System.out.println("Chu vi tam giác: " + triangle.getPerimeter());
        System.out.println("Thông tin tam giác: " + triangle);
        System.out.println("Màu: "+triangle.getColor());
    }
}
