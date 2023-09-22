package _03_array_java.practice;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            size = scanner.nextInt();
            if (size>20){
                System.out.print("Nhập số lượng mảng < 20 phần tử");
            }
        }while (size>20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Nhập phần tử "+ (i+1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Mảng ban đầu: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }


        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.print("Mảng đảo ngược: ");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }


    }
}
