package hwweek7practice;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Prog_17_SortArray {
    public static void main(String[] args) {
        //Numberic Array Declaration
        int[] numArray = {
                1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        //String Array declaration
        String[] strArray = {
                "Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"};
        System.out.println("Actual Numerical Array is : " + Arrays.toString(numArray));
        //Sorting the Array
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Array is : " + Arrays.toString(numArray));
        System.out.println(" ");
        System.out.println("Actual String Array is : " + Arrays.toString(strArray));
        //Sorting the Array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array in : " + Arrays.toString(strArray));
    }
}

