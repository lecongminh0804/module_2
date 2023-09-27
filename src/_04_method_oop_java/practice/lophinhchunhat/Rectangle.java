package _04_method_oop_java.practice.lophinhchunhat;

public class Rectangle {
    double width, height;

    public Rectangle(){
    }
    public Rectangle(double width, double heigth){
        this.width = width;
        this.height = heigth;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

}
