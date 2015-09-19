package funk.shane.hackerrank.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

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

        Arrays.sort(s, new StringComp());

        //Output
        for(int i = 0; i < n; i++)
        {
            System.out.println(s[i]);
        }
    }

    private static class StringComp implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            final BigDecimal bd1 = new BigDecimal(str1);
            final BigDecimal bd2 = new BigDecimal(str2);

            return bd2.compareTo(bd1);
        }
    }
}
