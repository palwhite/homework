package Question3;

/*3. Write a Java program to create a class known as "BankAccount" with methods called
    deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
    withdraw() method to prevent withdrawals if the account balance falls below one
    hundred.*/
public class BankAccount {

    public void deposite(){
        System.out.println("Opening bank account for deposite money");
    }

    public void withdraw(){
        System.out.println("First Withdrawal");
    }

    public static void main(String[] args) {
        BankAccount ba= new BankAccount();
        ba.deposite();
        ba.withdraw();
    }
}
