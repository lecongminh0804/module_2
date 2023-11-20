package _17_IO_Binary_File_Serialization.exercise.ex_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    private static final String FILE_PATH = "D:\\codegym\\module2\\src\\_17_IO_Binary_File_Serialization\\practice\\Product.txt";
    private static List<Product> ListProduct = new ArrayList<>();

    public static void main(String[] args) {
        docDuLieuTuFile();
        while (true){
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị thông tin sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    themsanpham();
                    break;
                case 2:
                    hienThiThongTinSanPham();
                    break;
                case 3:
                    timKiemSanPham();
                    break;
                case 4:
                    System.out.println("Đã thoát chương trình");
                    System.exit(0);

            }
        }
    }
    private static void themsanpham(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã sản phẩm: ");
        int ID = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm:");
        String NameProduct = scanner.nextLine();
        System.out.print("Nhập hãng sản phẩm: ");
        String CompanyProducts = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        float Price = scanner.nextFloat();

        Product NewProduct = new Product(ID,NameProduct,CompanyProducts,Price);
        ListProduct.add(NewProduct);
        System.out.println("Thêm sản phẩm thành công");
        luuDuLieuVaoFile(); // Ghi dữ liệu vào file
    }
    private static void hienThiThongTinSanPham() {
        System.out.println("Danh sách sản phẩm:");
        for (Product product : ListProduct) {
            System.out.println(product);
        }
    }
    private static void timKiemSanPham() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        String SearchProduct = scanner.nextLine();
        for (Product product : ListProduct) {
            if (product.getNameProduct().equals(SearchProduct)){
                System.out.println("Thông tin sản phẩm:");
                System.out.println(product);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có mã: " + SearchProduct);
    }
    private static void docDuLieuTuFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            ListProduct = (ArrayList<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi đọc dữ liệu từ file: " + e.getMessage());
        }
    }

    private static void luuDuLieuVaoFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(ListProduct);
        } catch (IOException e) {
            System.out.println("Lỗi ghi dữ liệu vào file: " + e.getMessage());
        }
    }
}






