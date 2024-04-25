package Question2;

/*2. Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car that overrides the drive() method to print "Repairing a
car".*/
public class Vehical {

    public void drive(){
        System.out.println("Driving Damaged Car");
    }

    public static void main(String[] args) {
        Vehical v=new Vehical();
        v.drive();
    }
}
