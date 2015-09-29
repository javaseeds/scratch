package funk.shane.hackerrank.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Shane on 9/28/2015.
 */
public class Anagrams {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String a = sc.nextLine();
        final String b = sc.nextLine();

        char[] achar = a.toCharArray();
        char[] bchar = b.toCharArray();

        Arrays.sort(achar);
        Arrays.sort(bchar);

        System.out.println( (Arrays.toString(achar).equalsIgnoreCase(Arrays.toString(bchar))) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String A, String B) {
        A = A.toLowerCase();
        B = B.toLowerCase();
        char[] achar = A.toCharArray();
        char[] bchar = B.toCharArray();

        Arrays.sort(achar);
        Arrays.sort(bchar);

        return (Arrays.toString(achar).equals(Arrays.toString(bchar)));
    }

}
