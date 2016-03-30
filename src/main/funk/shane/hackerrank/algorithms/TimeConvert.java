package funk.shane.hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by Shane on 8/29/2015.
 * https://www.hackerrank.com/challenges/time-conversion
 */
public class TimeConvert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        final String pmPattern = ".*PM$";

        // includes work on edge cases of noon and midnight
        int hr = (Integer.parseInt(time.substring(0, 2), 10)) % 12;

        if(time.matches(pmPattern)) {
            hr += 12;
        }

        time = time.replace(time.substring(0, 2), String.format("%02d", hr)); // preserve leading zero if needed
        time = time.substring(0, time.length() - 2);

        System.out.println(time);
    }
}
