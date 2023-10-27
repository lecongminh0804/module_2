package _09_DSA_ArrayList_LinkedList.exercise.ex_2;

import _09_DSA_ArrayList_LinkedList.exercise.ex_1.MyList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.addFirst(10);
        num.addLast(20);
        num.removeFirst();
        System.out.println(num.getFirst());
        System.out.println(num.get(1));
    }
}
