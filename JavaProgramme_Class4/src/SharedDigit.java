import java.util.Scanner;

/*13. Shared Digit
    Write a method named hasSharedDigit with two parameters of type int.
    Each numbershould be within the range of 10 (inclusive) - 99 (inclusive). If one ofthe numbers is not
    within the range, the method should return false.
    The method should return true if there is a digit that appears in both numbers,such as 2 in 12 and 23;
    otherwise, the method should return false.
    EXAMPLE INPUT/OUTPUT:
        * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
        * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
        * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
    NOTE: The method hasSharedDigit should be defined as public static*/
public class SharedDigit {

    public static boolean hasSharedDigit(int a,int b){
        if ((a>9&&a<100) && (b>9&&b<100)){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("Please Enter Number-1[In Range of 10 - 99] : ");
        int a=s.nextInt();
        System.out.print("Please Enter Number-2[In Range of 10 - 99] : ");
        int b=s.nextInt();
        if (hasSharedDigit(a,b)){
            System.out.println("Input is within range.");
        }
        else
            System.out.println("Invalid Input.\nNot in range of 10-99.");
    }
}
