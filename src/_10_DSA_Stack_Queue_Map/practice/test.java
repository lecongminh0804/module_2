package _10_DSA_Stack_Queue_Map.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        scanner.close();
        TreeMap<String, Integer> CountMap = new TreeMap<>();
        // Tách chuỗi thành các từ và duyệt qua từng từ
        String[] words = input.split("");
        for (String word : words) {
            word = word.toLowerCase();
            if (CountMap.containsKey(word)) {
                int count = CountMap.get(word);
                CountMap.put(word, count + 1);
            } else {
                CountMap.put(word, 1);
            }
        }
        CountMap.remove(" ");// xoá khoảng cách
        for (String word : CountMap.keySet()) {
            int count = CountMap.get(word);
            System.out.println(word + ": " + count);
        }
    }
}
