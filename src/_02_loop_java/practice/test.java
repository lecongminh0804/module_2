package _02_loop_java.practice;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Nhập số lượng phần tử < 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Phân tử thứ " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.print("Mảng đã nhập: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\nNhập số cần xoá: ");
        int indexDel = input.nextInt();

        if (indexDel >= 0 && indexDel < size) {
            int[] NewArray = new int[size - 1];

            int j = 0;
            for (i = 0; i < size; i++) {
                if (i != indexDel) {
                    NewArray[j] = array[i];
                    j++;
                }
            }
            array = NewArray;

            for (i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }


        } else {
            System.out.println("số không hợp lệ.");
        }
    }

}



