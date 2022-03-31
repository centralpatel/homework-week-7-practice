package hwweek7practice;

import java.util.Scanner;

/*1. Write a java Program that tells us that Input number is odd or even?
 * Hint: Use ternary operator (?:)
 * */
public class Prog_1_OddEvenTernaryOp {

    public static void main(String[] args) {
        //Scanner declaration to read input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number); //calling method
        //closing the scanner object
        scanner.close();
    }

    public static void isItOddOrEvenNumber(int number) {
        // using ternary operator to find out number is Odd or Even
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " is an " + evenOrOdd + " number");
    }
}
