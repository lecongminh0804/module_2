package _10_DSA_Stack_Queue_Map.exercise.ex_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class WordFrequencyCounter {
//    public static void CountCharInString(String input){
//        TreeMap<String, Integer> CountMap = new TreeMap<>();
//        String[] words = input.split("");
//        for (String word : words){
//            if (CountMap.containsKey(word)){
//                int count = CountMap.get(word);
//                CountMap.put(word, count + 1);
//            }else {
//                CountMap.put(word, 1);
//            }
//        }
//        CountMap.remove(" ");
//        for (String word : CountMap.keySet()) {
//            int count = CountMap.get(word);
//            System.out.println(word + ": " + count);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập chuỗi: ");
//        String input = scanner.nextLine();
//        input = input.toLowerCase();
//        CountCharInString(input);
//
//    }
public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add(7);
    list.add(8);
    list.add(9);
    System.out.println(list.remove(0));
}


}
