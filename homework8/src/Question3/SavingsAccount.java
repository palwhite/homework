package Question3;

import java.util.Scanner;

public class SavingsAccount extends BankAccount{

    public void withdraw(){
        double withdraw=0;

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the amount that you withraw: ");
         withdraw=s.nextDouble();

         if (withdraw <= 100){
             System.out.println("Sucsess");
         }
         else {
             System.out.println("Insufficient Balance");
         }
    }

    public static void main(String[] args) {
        SavingsAccount sa=new SavingsAccount();
        sa.withdraw();
    }
}
