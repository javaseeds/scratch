package funk.shane.hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by Shane on 9/7/2015.
 */
public class InsertionSort1 {

    public static void insertIntoSorted(int[] ar) {
        int arrLen = ar.length;
        int indx = arrLen-1;
        int value = ar[indx]; // right most cell

        while(indx > 0) {
            indx--;
            if(ar[indx] > value) {
                ar[indx + 1] = ar[indx];
            }
            else {
                ar[indx + 1] = value;
            }
            printArray(ar);
        }
    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }

    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.printf("%d ", n);
        }
        System.out.println();
    }
}
