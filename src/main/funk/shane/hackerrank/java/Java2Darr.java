package funk.shane.hackerrank.java;

import java.util.Scanner;

/**
 * Created by Shane on 9/19/2015.
 */
public class Java2Darr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gridSize = 6;
        int[][] arr = new int[gridSize][];

        for(int i = 0; i < gridSize; i++) {
            String str = sc.nextLine();
            arr[i] = convertArr(str.split(" "));
        }
        display(arr);
    }

    private static int[] convertArr(final String[] arr) {
        int[] intArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

        return intArr;
    }

    private static void display(final int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            int[] tmpIntArr = arr[i];
            for(int j = 0; j < arr.length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
