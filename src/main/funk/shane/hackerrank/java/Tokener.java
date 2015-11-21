package funk.shane.hackerrank.java;

import java.util.Scanner;

/**
 * Created by Shane on 9/29/2015.
 */
public class Tokener {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        if(str == null || str.length() < 1) {
            System.out.println("0");
        }
        else {
            String[] words = str.split("[ !,?._'@]+");

            System.out.println(words.length);
            for (String s : words) {
                System.out.println(s);
            }
        }
    }
}
