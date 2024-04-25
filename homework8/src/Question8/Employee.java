package Question8;

/*8. Write a Java program to create a class Employee with a method called
    calculateSalary(). Create two subclasses Manager and Programmer. In each subclass,
    override the calculateSalary() method to calculate and return the salary based on their
    specific roles.*/
public class Employee {

    public void calculateSalary(){
        System.out.println("This Method is used to calculate salary");
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.calculateSalary();
    }
}
