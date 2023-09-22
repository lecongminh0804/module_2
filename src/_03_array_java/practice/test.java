package _03_array_java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Nhập sai nhập lại ");
            }
        }while (size>20);
        array = new int[size];
        int i =0;
        while (i<array.length){
            System.out.print("phần tử thứ "+(i+1)+":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Mảng đã nhập ");
        for ( i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
//        int index = 1;
//        int max = array[0];
//        for ( i =0; i < array.length; i++){
//            if (array[i] > max) {
//                max = array[i];
//                index = i + 1;
//            }
//        }
//        int temp = array[0];
        for ( i = 0; i < array.length ; i++){
            for ( int j = array.length + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

//        System.out.print("\nmảng lớn nhất "+ max + " ,vị trí " + index);
        System.out.print("\nMảng sắp xếp tắng dần: " );
        for ( i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
