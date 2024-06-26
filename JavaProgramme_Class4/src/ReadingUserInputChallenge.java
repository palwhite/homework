import java.util.Scanner;

/*1. Read 10 numbers from the console entered by the user and print the sum of those
    numbers.
    -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
    -If hasNextInt() returnsfalse, print the message Invalid Number. Continue reading until you have read
    10 numbers.
    -Use the nextInt() method to get the number and add itto the sum.
    -Before the user enters each number, print the message Enter number #x: where x representsthe
    count, i.e. 1, 2, 3, 4, etc.
    -For example,the first message printed to the user would be Enter number #1:,the next Enter number
    #2:, and so on.
    Hint:
        -Use a while loop.
        -Use a counter variable for counting valid numbers.
        -Close the scanner after you don't need it anymore.
        -Create a class with the name ReadingUserInputChallenge.*/
public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        int sum=0;
        int num = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("How many numbers you want to enter? : ");

        if (s.hasNextInt()) {
            num=s.nextInt();
            for (int i=0;i<num;i++){
                System.out.print("Please Enter Number-"+(i+1)+" : ");
                int temp=s.nextInt();
                sum+=temp;
            }
        }
        else
            System.out.println("Please Enter Only Integer Value.");

        s.close();
        System.out.println("Sum of "+num+" numbers : "+sum);
    }
}
