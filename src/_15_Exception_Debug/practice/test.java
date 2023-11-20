package _15_Exception_Debug.practice;

import java.io.*;
import java.util.Scanner;

public class test {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int select = 0;
        do {
            System.out.println("-------Management Furama-------");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Managerment");
            System.out.println("5. Promotion Management");
            System.out.println("8. Exit");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    EmployeeManagement();
                case 2:
                    CustomerManagement();
                case 3:
                    FacilityManagement();
                case 4:
                    BookingManagerment();
                case 5:
                    PromotionManagement();
                case 6:
                    System.exit(0);
            }
        }while (true);
    }
    private static void EmployeeManagement(){
        int select = 0;
        do {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    //
                case 2:
                    //
                case 3:
                    //
                case 4:
                    //
            }
        }while (true);
    }
    private static void CustomerManagement(){
        int select = 0;
        do {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    //
                case 2:
                    //
                case 3:
                    //
                case 4:
                    //
            }
        }while (true);
    }
    private static void FacilityManagement(){
        int select = 0;
        do {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Edit facility");
            System.out.println("4. Return main menu");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    //
                case 2:
                    //
                case 3:
                    //
                case 4:
                    //
            }
        }while (true);
    }
    private static void BookingManagerment(){
        int select = 0;
        do {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    //
                case 2:
                    //
                case 3:
                    //
                case 4:
                    //
                case 5:
                    //
                case 6:
            }
        }while (true);
    }
    private static void PromotionManagement(){
        int select = 0;
        do {
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    //
                case 2:
                    //
                case 3:
                    //
            }
        }while (true);
    }




}
