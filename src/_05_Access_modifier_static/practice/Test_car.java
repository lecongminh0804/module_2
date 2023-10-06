package _05_Access_modifier_static.practice;

public class Test_car {
    public static void main(String[] args) {
        Car car1 = new Car("BMW","v12");
        System.out.println("Xe "+Car.numberOfCars+": "+car1.getName()+", động cơ: "+car1.getEngine());
        Car car2 = new Car("HONDA","v16");
        System.out.println("Xe "+Car.numberOfCars+": "+car2.getName()+", động cơ: "+car2.getEngine());
    }
}
