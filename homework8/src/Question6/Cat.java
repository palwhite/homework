package Question6;

public class Cat extends Animal{

    public void sound(){

        System.out.println("Cat does Meow Meow Meow Meow...");
    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.sound();
    }
}
