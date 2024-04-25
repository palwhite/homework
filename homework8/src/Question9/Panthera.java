package Question9;

public class Panthera extends Animal{

    public void move(){

        System.out.println("Animal's Moves differently");
        System.out.println("Runs Fastest");
    }
    public void makesound(){

        System.out.println("They make sound: ");
        System.out.println("Roar");
    }

    public static void main(String[] args) {
        Panthera p=new Panthera();
        p.move();
        p.makesound();
    }
}
