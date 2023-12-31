package _07_AbstractClass_Interface.exercise.ex_1;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        Shape[] arr = new Shape[3];
        arr[0]= new Circle(5, "red", true);
        arr[1]= new Rectangle("yellow", false, 5, 9);
        arr[2]= new Square(15,"blue", false);


        for(Shape e : arr){
            if(!(e instanceof Square)){
                System.out.println(e.getClass().getSimpleName());
                e.resize((new Random()).nextInt(100));
                System.out.println(e);
                System.out.println("-------------------------------------");
            }
        }
    }
}

