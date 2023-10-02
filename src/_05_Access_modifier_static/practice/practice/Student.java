package _05_Access_modifier_static.practice.practice;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    // hàm tạo để khởi tạo biến
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //phương thức tĩnh để thay đổi giá trị của biến tĩnh
    static void change() {
        college = "CODEGYM";
    }

    //phương thức hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }


}
