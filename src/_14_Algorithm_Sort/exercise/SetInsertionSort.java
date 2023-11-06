package _14_Algorithm_Sort.exercise;

import java.util.Arrays;

public class SetInsertionSort {
    public static void sort(int[] array){
        for (int i = 1; i < array.length; i++){
            int currentElement = array[i];
            int k = i - 1;
            for (; k >= 0 && array[k] > currentElement; k--){
                array[k + 1] = array[k];
            }
            array[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {2,5,23,73,4,5,8};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
