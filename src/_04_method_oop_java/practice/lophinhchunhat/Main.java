package _04_method_oop_java.practice.lophinhchunhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập width: ");
        double width = scanner.nextDouble();
        System.out.print("Nhập height: ");
        double heigth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,heigth);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
