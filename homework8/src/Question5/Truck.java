package Question5;

public class Truck extends Vehical{

    public void details(){
        System.out.println("Truck Make: TATA");
        System.out.println("Truck Model: Abc12");
        System.out.println("Truck Fuel_type: Petrol");
        System.out.println("Truck Year: 2020");
    }
    public void fuel_efficiency(){
        System.out.println("Truck Fuel_efficiency: 100l");
    }
    public void distance_traveled(){
        System.out.println("Truck Distance_Traveled: 30,000km");
    }
    public void maximum_speed(){
        System.out.println("Truck Maximum_Speed: 50mph");
    }

    public static void main(String[] args) {
        Truck t=new Truck();
        t.details();
        t.fuel_efficiency();
        t.distance_traveled();
        t.maximum_speed();
    }
}
