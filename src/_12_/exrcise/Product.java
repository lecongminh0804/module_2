package _12_.exrcise;

public class Product {
    int id;
     String name;
     int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mã sản phẩm: " + id + ", Tên sản phẩm: " + name + ", Giá sản phẩm: " + price;
    }
}
