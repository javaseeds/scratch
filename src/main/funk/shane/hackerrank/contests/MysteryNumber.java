package funk.shane.hackerrank.contests;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Shane on 12/29/2015.
 */
public class MysteryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        String[] A = (sc.nextLine()).trim().split(" ");
        Arrays.sort(A);

        String[] B = (sc.nextLine()).trim().split(" ");
        Arrays.sort(B);

        System.out.printf("(%d), %s - %s%n", N, Arrays.toString(A), Arrays.toString(B));
    }
}
