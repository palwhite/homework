package Question10;

public class CheckingAccount extends BankAccount{

    public void deposit(){
        System.out.println("checking account to deposit money!!");
    }

    public void withdraw(){
        System.out.println("checking account to withdraw money!!");
    }

    public static void main(String[] args) {
        CheckingAccount ca=new CheckingAccount();
        ca.deposit();
        ca.withdraw();
    }
}
