package Question10;

/*10. Write a Java program to create a base class BankAccount with methods deposit() and
    withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
    withdraw() method in each subclass to impose different withdrawal limits and fees.*/
public class BankAccount {

    public void deposit(){
        System.out.println("This account is to deposit money!!");
    }

    public void withdraw(){
        System.out.println("This account has some money to withdraw!!");
    }

    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
        ba.deposit();
        ba.withdraw();
    }
}
