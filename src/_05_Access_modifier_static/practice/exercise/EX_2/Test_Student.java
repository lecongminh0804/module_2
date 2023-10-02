package _05_Access_modifier_static.practice.exercise.EX_2;

public class Test_Student {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name: " + student.getName()+"\n" + "Class: " + student.getClasses());
        student.setName("Minh");
        student.setClasses("C03");
        System.out.println("Name: " + student.getName()+"\n" + "Class: " + student.getClasses());
    }
}
