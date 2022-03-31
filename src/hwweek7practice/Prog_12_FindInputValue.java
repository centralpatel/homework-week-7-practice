package hwweek7practice;

import java.util.Scanner;

public class Prog_12_FindInputValue {
    public static void main(String[] args) {
        //Scanner declaration to read input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Character : ");
        char ch = scanner.next().charAt(0);
        //Object Creation
        Prog_12_FindInputValue inputValue = new Prog_12_FindInputValue();
        inputValue.checkInputValueIsAlpabetNumberOrSymbol(ch);
        //Closing the scanner object
        scanner.close();
    }

    //Find the input value is Aplabet, Digit and Symbol
    public void checkInputValueIsAlpabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is and Alpabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit");
        } else {
            System.out.println(ch + " is a Symbol");
        }
    }
}
