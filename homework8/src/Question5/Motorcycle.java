package Question5;

public class Motorcycle extends Vehical{

    public void details(){
        System.out.println("Motorcycle Make: TATA");
        System.out.println("Motorcycle Model: Abc12");
        System.out.println("Motorcycle Fuel_type: Petrol");
        System.out.println("Motorcycle Year: 2020");
    }
    public void fuel_efficiency(){
        System.out.println("Motorcycle Fuel_efficiency: 40l");
    }
    public void distance_traveled(){
        System.out.println("Motorcycle Distance_Traveled: 10,000km");
    }
    public void maximum_speed(){
        System.out.println("Motorcycle Maximum_Speed: 70mph");
    }

    public static void main(String[] args) {
        Motorcycle m=new Motorcycle();
        m.details();
        m.fuel_efficiency();
        m.distance_traveled();
        m.maximum_speed();

    }
}
