package funk.shane.hackerrank.java;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Shane on 9/13/2015.
 */
public class BigDec {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n+2];
        for(int i = 0; i < n; i++)
        {
            s[i] = sc.next();
        }


        //Output
        for(int i = 0; i < n; i++)
        {
            System.out.println(s[i]);
        }
    }
}
