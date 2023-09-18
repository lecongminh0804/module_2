package _02_loop_in_java.exercise;

import java.util.Scanner;

public class B1_ShowTypes {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Tam giác vuông(botton-left)");
            System.out.println("3. Tam giác vuông(top-left )");
            System.out.println("4. Tam cân");
            System.out.println("5. Thoát");
            System.out.println("Nhập 1 số bạn muốn vẽ: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    int height = 3;
                    int width = 6;
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i < 9; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    int n = 5; // Số hàng của tam giác cân
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;

                default:
                    System.out.println("Không có lựa chọn, xin chọn lại");
            }
        } while (choice != 5);
    }
}

