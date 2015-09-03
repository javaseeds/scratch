package funk.shane.hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by Shane on 8/28/2015.
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        for(int i = 0; i < height; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < (i+1); j++) {
                sb.append("#");
            }

            System.out.printf("%" + height + "s%n", sb.toString());
        }
    }
}
