package Question5;

/*5. Write a Java program to create a vehicle class hierarchy. The base class should be
    Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
    properties such as make, model, year, and fuel type. Implement methods for
    calculating fuel efficiency, distance traveled, and maximum speed.*/
public class Vehical {

    public void view(){
        System.out.println("This is a Base class");
    }

    public static void main(String[] args) {
        Vehical vh=new Vehical();
        vh.view();
        Motorcycle m=new Motorcycle();
        m.details();
        m.fuel_efficiency();
        m.distance_traveled();
        m.maximum_speed();
        Truck t=new Truck();
        t.details();
        t.fuel_efficiency();
        t.distance_traveled();
        t.maximum_speed();
        Car c=new Car();
        c.details();
        c.fuel_efficiency();
        c.distance_traveled();
        c.maximum_speed();
    }
}
