package Question1;

/*1. Write a Java program to create a class called codebuster with a method called
    groupName(). Create a subclass called codebusterGroups() that overrides the
    groupName() method.*/
public class Codebuster {

    public void groupName(){
        System.out.println("Mehod in codebuster class");
    }

    public static void main(String[] args) {
        Codebuster c=new Codebuster();
        c.groupName();
    }
}
