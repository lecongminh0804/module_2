package _02_loop_java.exercise;

import java.util.Scanner;

public class B2_Display20PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n số lượng số nguyên tố cần in ra: ");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 1; i < 30000; i++) {
            if(count < number){
                if(isPrime(i)){
                    System.out.println(i);
                    System.out.println("\t");
                    count++;
                }
            }
        }

    }
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
