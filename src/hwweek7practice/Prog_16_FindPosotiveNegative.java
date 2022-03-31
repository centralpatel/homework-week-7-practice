package hwweek7practice;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Prog_16_FindPosotiveNegative {
    public static void main(String[] args) {
        //Scanner Declaration to read input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        findNumberIsPositiveOrZero(number);
        //Closing scanner object
        scanner.close();
    }

    // Finding the number is Positive Negative or Zero
    public static void findNumberIsPositiveOrZero(int number) {
        if (number > 0) {
            System.out.println(number + " is a Positive Number");
        } else if (number < 0) {
            System.out.println(number + " is a Negative Number");
        } else {
            System.out.println(number + " is Zero");
        }
    }
}
