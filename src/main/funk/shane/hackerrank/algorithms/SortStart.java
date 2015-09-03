package funk.shane.hackerrank.algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Shane on 8/30/2015.
 */
public class SortStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];

        for(int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.binarySearch(arr, target));
    }
}
