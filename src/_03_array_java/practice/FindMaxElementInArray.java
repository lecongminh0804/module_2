package _03_array_java.practice;

import java.util.Scanner;

public class FindMaxElementInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.print("Nhập số lượng phần tử < 20");
            }
        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Phân tử thứ "+(i+1)+": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Mảng đã nhập: ");
        for ( i = 0; i < array.length; i++){
            System.out.print(array[i]+"\t");
        }
        System.out.print("\n");
        int index = 1;
        int max = array[0];
        for ( i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("Mảng lớn nhất " + max + " ,ở vị trí " + index);
    }
}
