package _07_AbstractClass_Interface.exercise.ex_1;

public class Square extends Rectangle {
    public Square(){
        super(1,1);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setHeigth(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeigth(double heigth) {
        setSide(heigth);
    }

    @Override
    public String toString() {
        return "hình vuông có cạnh " + getSide() +
                "\nĐó là lớp con của: " + super.toString();

    }
}
