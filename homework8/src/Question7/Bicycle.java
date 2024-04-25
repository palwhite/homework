package Question7;

public class Bicycle extends Vehical{
    public void speedup(){

        System.out.println("Bicycle Speed: 10mph");
    }

    public static void main(String[] args) {
        Bicycle b=new Bicycle();
        b.speedup();
    }
}
