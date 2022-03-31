package hwweek7practice;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Prog_6_OddEven {
    public static void main(String[] args) {
        //Scanner declaration to read input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int number = scanner.nextInt();
        Prog_6_OddEven oddEven = new Prog_6_OddEven();
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number) + " Number");
        //Closing the scanner object
        scanner.close();
    }

    // Checking odd or even number
    public String isItEvenOrOddNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
