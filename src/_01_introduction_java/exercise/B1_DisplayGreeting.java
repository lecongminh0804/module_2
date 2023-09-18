package _01_introduction_java.exercise;
import java.util.Scanner;
public class B1_DisplayGreeting {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter you name: " );
        String name = Sc.nextLine();
        System.out.println("Hello " + name);
    }
}
