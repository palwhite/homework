package Question7;

public class Car extends Vehical{
    public void speedup(){

        System.out.println("Car Speed: 70mph");
    }

    public static void main(String[] args) {
        Car c=new Car();
        c.speedup();
    }
}
