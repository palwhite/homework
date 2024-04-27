import java.util.Scanner;

/*7. First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needsto find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needsto return -1 to indicate an invalid value.

Example input/output
* sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
* sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
* sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which

gives us 0+0 and the sum is 0.

* sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which

gives us 5+5 and the sum is 10.

* sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
NOTE: The method sumFirstAndLastDigit needsto be defined as public static*/
public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int num) {
        if (num >= 0) {
            int firstDigit = num % 10;
            int lastDigit = 0;
            for (int i = num; i != 0; i /= 10) {
                lastDigit = i % 10;
            }
            return firstDigit + lastDigit;
        } else
            return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please Enter Any Number : ");
        int num = s.nextInt();
        if (sumFirstAndLastDigit(num)!=-1){
            System.out.println("Sum of First Digit and Last Digit is "+sumFirstAndLastDigit(num));
        }
        else
            System.out.println("Invalid Input.");
    }
}
