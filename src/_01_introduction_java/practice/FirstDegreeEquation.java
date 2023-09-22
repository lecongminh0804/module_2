package _01_introduction_java.practice;

import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0){
            double answer = (c-b) / a;
            System.out.println("Phương trình có nghiện x= " + answer);
        }else {
            if (b==c){
                System.out.print("The solution is all x!");
            }else {
                System.out.print("No solution!");
            }
        }
    }
}
