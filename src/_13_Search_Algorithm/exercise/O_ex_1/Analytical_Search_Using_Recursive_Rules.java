package _13_Search_Algorithm.exercise.O_ex_1;

public class Analytical_Search_Using_Recursive_Rules {
    private static int  binarySearch(int[] array, int left, int right, int value){
        if (left < right){
            int middle = (left + right)/2;
            if (array[middle] == value){
                return middle;
            }else if (value > array[middle]){
                return binarySearch(array,middle +1,right,value);
            }else {
                return binarySearch(array,left,middle-1,value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a={2,8,10,25,57,60,75,90,100};
        System.out.println(binarySearch(a,0,a.length-1,10));
    }
}
