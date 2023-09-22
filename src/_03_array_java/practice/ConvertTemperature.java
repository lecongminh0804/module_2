package _03_array_java.practice;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu. ");
            System.out.println("1. Độ F sang độ C");
            System.out.println("2. Độ C sang độ F");
            System.out.println("3. Thoát chương trình");
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Nhập độ F: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Độ F sang độ C: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Nhập độ C: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Độ C sang độ F: " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 3:
                    System.exit(3);
            }
        } while (choice != 0);
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}
