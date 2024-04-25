package Question4;

public class Cheetah extends Animal{

    public void move(){
        System.out.println("Cheetah runs at 100kph");
    }

    public static void main(String[] args) {

        Animal a=new Animal();
        a.move();
        Cheetah c=new Cheetah();
        c.move();
    }
}
