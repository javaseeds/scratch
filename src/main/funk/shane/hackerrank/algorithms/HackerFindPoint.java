package funk.shane.hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by Shane on 8/28/2015.
 */
public class HackerFindPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int x1, y1, x2 ,y2, xslope, yslope;

        for(int i = 0; i < testCases; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            xslope = x2 - x1;
            yslope = y2 - y1;

            System.out.printf("%d %d%n", x2 + xslope, y2 + yslope);
        }
    }
}
