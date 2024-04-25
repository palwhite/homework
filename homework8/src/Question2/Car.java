package Question2;

public class Car extends Vehical{

    public void drive(){
        System.out.println("Repairing a car");
    }

    public static void main(String[] args) {
        Car c=new Car();
        c.drive();
    }
}
