import java.util.Scanner;

/*2. -Read the numbers from the console entered by the user and print the minimum
    and maximum number the user has entered.
    -Before the user entersthe number, print the message Enter number:
    -If the user enters an invalid number, break out of the loop and print the minimum and maximum
    number.
    Hint:
        -Use an endless while loop.
        -Create a class with the name MinAndMaxInputChallenge.*/
public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        int a,b;
        Scanner s=new Scanner(System.in);
        while (true) {
            System.out.println("Enter First Number: ");
            a = s.nextInt();
            System.out.println("Enter Second Number");
            b = s.nextInt();
            if (a>0 && b>0) {
                if (a < b) {
                    System.out.println("Maximmum number is: " + b);

                } else if (a > b) {
                    System.out.println("Maximmum number is: " + a);

                } else {
                    System.out.println("Please Enter Valid Number!!");
                }
                break;
            }
            else {
                System.out.println("Minimum Maximum Numbers");
                break;
            }
        }
    }
}
