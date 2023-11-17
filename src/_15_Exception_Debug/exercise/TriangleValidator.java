package _15_Exception_Debug.exercise;

import java.util.Scanner;

public class TriangleValidator {
    public static void Triangle(int a, int b, int c) throws IllegalTriangleException {
        if(a < 0 || b < 0 || c < 0){
            throw new IllegalTriangleException("không nhận số âm");
        }

        if(a+ b < c || a + c < b || b + c < a){
            throw new IllegalTriangleException("Tổng 2 bên không được nhỏ hơn bên nhắc");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập cạnh a: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh b: ");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh c: ");
            int c = Integer.parseInt(scanner.nextLine());
            Triangle(a,b,c);
            System.out.println("Là tam giác");
        } catch (NumberFormatException e) {
            System.out.println("Số không đúng định dạng");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Không có giá trị");
        }
    }
}
