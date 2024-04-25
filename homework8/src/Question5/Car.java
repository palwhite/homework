package Question5;

public class Car extends Vehical{
    public void details(){
        System.out.println("Car Make: Honda");
        System.out.println("Car Model: honda city");
        System.out.println("Car Fuel_type: Diesel");
        System.out.println("Car Year: 2019");
    }
    public void fuel_efficiency(){
        System.out.println("Car Fuel_efficiency: 70l");
    }
    public void distance_traveled(){
        System.out.println("Car Distance_Traveled: 60,000km");
    }
    public void maximum_speed(){
        System.out.println("Car Maximum_Speed: 70mph");
    }

    public static void main(String[] args) {
        Car c=new Car();
        c.details();
        c.fuel_efficiency();
        c.distance_traveled();
        c.maximum_speed();

    }
}
