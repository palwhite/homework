package Question6;

public class Bird extends Animal{
    public void sound(){

        System.out.println("Bird does Chi..Chi..Chi..");
    }

    public static void main(String[] args) {
        Bird b=new Bird();
        b.sound();
    }
}
