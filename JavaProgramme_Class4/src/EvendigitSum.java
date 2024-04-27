import java.util.Scanner;

/*11. Even Digit Sum
    Write a method named getEvenDigitSum with one parameter of type int called number.
    The method should return the sum of the even digits within the number.
    If the number is negative,the method should return -1 to indicate an invalid value.
    EXAMPLE INPUT/OUTPUT:
        * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
        * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
        * getEvenDigitSum(-22); → should return -1 since the number is negative

    NOTE: The method getEvenDigitSum should be defined as public static
*/
public class EvendigitSum {

    public static int getEvenDigitSum(int num) {
        if (num > 0) {
            int digit;
            int sum = 0;
            while (num > 0) {
                digit = num % 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
                num /= 10;
            }
            return sum;
        } else
            return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please Enter Any Number : ");
        int num = s.nextInt();
        if (getEvenDigitSum(num) != -1) {
            System.out.println("Sum of Even Digit is " + getEvenDigitSum(num));
        } else
            System.out.println("Invalid Input.");
    }
}
