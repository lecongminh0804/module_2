package _17_IO_Binary_File_Serialization.exercise.ex_1;

import java.io.Serializable;

public class Product implements Serializable {
    private int ID;
    private String NameProduct;
    private String CompanyProducts;
    private float Price;

    public Product(int ID, String nameProduct, String companyProducts, float Price) {
        this.ID = ID;
        this.NameProduct = nameProduct;
        this.CompanyProducts = companyProducts;
        this.Price = Price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNameProduct() {
        return NameProduct;
    }

    public void setNameProduct(String nameProduct) {
        NameProduct = nameProduct;
    }

    public String getCompanyProducts() {
        return CompanyProducts;
    }

    public void setCompanyProducts(String companyProducts) {
        CompanyProducts = companyProducts;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        this.Price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", NameProduct='" + NameProduct + '\'' +
                ", CompanyProducts='" + CompanyProducts + '\'' +
                ", price=" + Price +
                '}';
    }
}
