/*14. Write a program in Java to display the pattern like a diamond.
While loop
              *
             ***
            *****
           *******
          *********
         ***********
        *************
         ***********
          *********
           *******
            *****
             ***
              * */
public class Question14 {

    public static void main(String[] args) {

        int number = 7;
        int i = 1;
        int j;

        while (i <= number) {
            j = 1;

            while (j++ <= number - i) {

                System.out.print(" ");
            }

            j = 1;

            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }

            System.out.println();
            i++;
        }

        i = number - 1;

        while (i > 0) {
            j = 1;

            while (j++ <= number - i) {
                System.out.print(" ");
            }

            j = 1;

            while (j++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}
