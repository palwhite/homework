package Question8;

public class Programmer extends Employee{
    public void calculateSalary(){

        System.out.println("Programmer's salary is less than Manager");
    }

    public static void main(String[] args) {
        Programmer p=new Programmer();
        p.calculateSalary();
    }
}
