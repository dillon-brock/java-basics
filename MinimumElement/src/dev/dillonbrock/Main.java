package dev.dillonbrock;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] userInts = readIntegers();
        System.out.println(Arrays.toString(userInts));

        int minVal = findMin(userInts);
        System.out.println("minimum value = " + minVal);

        int[] testArray = new int[] {1, 2, 3, 4, 5};
        reverse(testArray);
        System.out.println(Arrays.toString(testArray));

        int[] testArray2 = new int[] {1, 2, 3, 4};
        reverse(testArray2);
        System.out.println(Arrays.toString(testArray2));
    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by commas:");
        String list = scanner.nextLine();
        String[] intListAsString = list.split(",");

        int[] intList = new int[intListAsString.length];

        for (int i = 0; i < intList.length; i++) {
            intList[i] = Integer.parseInt(intListAsString[i]);
        }

        return intList;
    }

    private static int findMin(int[] ints) {

        int min = ints[0];
        for (int i : ints) {
            if (i < min) min = i;
        }
        return min;
    }

    private static void reverse(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
