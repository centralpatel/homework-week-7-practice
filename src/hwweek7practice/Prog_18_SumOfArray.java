package hwweek7practice;

import java.util.Arrays;

/**
 * Write a Java program to sum values of an array.
 */
public class Prog_18_SumOfArray {
    public static void main(String[] args) {
        //Numeric Array Declaration
        int[] numArray = {
                1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        int sum = 0;
        //Calculating the sum of array value using for loop
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        System.out.println("Value of the elements of the Arrays is : " + Arrays.toString(numArray));
        System.out.println("Sum of all the value of the Arrays is : " + sum);
    }
}
