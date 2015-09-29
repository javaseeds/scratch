package funk.shane.hackerrank.java;

import java.util.Scanner;

/**
 * Created by Shane on 9/28/2015.
 */
public class StrCompare {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String str = sc.nextLine();
        int k = sc.nextInt();
        String min = null, max = null;


        for(int i = 0; i < str.length(); i++) {

            if((i + k) > str.length()) {
                break;
            }
            else {
                final String tmp = str.substring(i, i+k);

                if(i == 0) {
                    min = tmp;
                    max = tmp;
                }
                else if(tmp.compareTo(min) < 0) {
                    min = tmp;
                }
                else if(tmp.compareTo(max) > 0) {
                    max = tmp;
                }
            }
        }

        System.out.printf("%s%n%s", min, max);
    }
}
