package Question6;

/*6. Write a Java program to create a base class Animal (Animal Family) with a method
    called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
    each subclass to make a specific sound for each animal.*/
public class Animal {

    public void sound(){
        System.out.println("Every Animal has different sound");
    }

    public static void main(String[] args) {
        Animal a=new Animal();
        a.sound();
    }
}
