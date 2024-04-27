import java.util.Scanner;

/*3. Write a Java program that takes the user to provide a single character from the
    alphabet. Print Vowel of Consonant, depending on the user input. If the user input
    Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
    error message.
    For eg:
        Input an alphabet: p
        Expected Output:
        Input letter is Consonant*/
public class VowelofConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Input an alphabet: ");
        String input = in.next().toLowerCase();
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1)
        {
            System.out.println("Invalid Input.\nPlease Enter Only Single Alphabet.");
        }
        else if (!(lowercase))
        {
            System.out.println("Invalid Input.\nPlease Enter Only Alphabet.");
        }
        else if (vowels)
        {
            System.out.println("Letter is Vowel");
        }
        else
        {
            System.out.println("Letter is Consonant");
        }

    }
}
