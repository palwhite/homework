package Question9;

public class Bird extends Animal{

    public void move(){

        System.out.println("Animal's Moves differently:");
        System.out.println("Bird Fly");
    }
    public void makesound(){

        System.out.println("They make sound: ");
        System.out.println("Chi..Chi..Chi..");
    }

    public static void main(String[] args) {
        Bird b=new Bird();
        b.move();
        b.makesound();
    }
}
