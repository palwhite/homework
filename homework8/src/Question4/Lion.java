package Question4;

public class Lion extends Cheetah{

    public void move(){
        System.out.println("Lion Moves Slower then Cheetah");
    }

    public static void main(String[] args) {
        Animal a=new Animal();
        a.move();
        Cheetah c=new Cheetah();
        c.move();
        Lion l=new Lion();
        l.move();
    }
}
