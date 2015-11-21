package funk.shane.hackerrank.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Shane on 11/10/2015.
 */
public class HashSet1 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;

        final Set<String> left = new HashSet<>();
        final Set<String> right = new HashSet<>();

        for(int i = 0; i < t; i++) {
            boolean l = left.add(sc.next());
            boolean r = right.add(sc.next());

            if(l || r) {
                count++;
            }
            System.out.println(count);
        }
    }
}
