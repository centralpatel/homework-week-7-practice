package hwweek7practice;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Write a Java program to calculate the average value of array
 */
public class Prog_19_AverageOfArray {
    public static void main(String[] args) {
        //Numeric Array Declaration
        int[] numArray = {
                1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        int sum = 0;
        //Calculating the sum of Arrays value
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        //Find the Average of Arrays value
        int average = sum / numArray.length;
        System.out.println("Value of the elements of the Arrays is : " + Arrays.toString(numArray));
        System.out.println("Average of all the values of the Arrays is : " + average);
    }
}
