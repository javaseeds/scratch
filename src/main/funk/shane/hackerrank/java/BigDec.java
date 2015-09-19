package funk.shane.hackerrank.java;

import java.util.*;

/**
 * Created by Shane on 9/13/2015.
 */
public class BigDec {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; i++)
        {
            s[i] = sc.next();
        }

        Set<String> set = new TreeSet<>(Collections.reverseOrder());
        set.addAll(Arrays.asList(s));

        s = set.toArray(new String[n]);

        //Output
        for(int i = 0; i < n; i++)
        {
            System.out.println(s[i]);
        }
    }
}
