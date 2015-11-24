package funk.shane.regex;

import java.util.Scanner;

/**
 * Created by Shane on 11/23/2015.
 */
public class Utopia {
    private static final String VALID = "VALID";
    private static final String INVALID = "INVALID";
    private static final String VALID_ID = "^[a-z]{0,3}[0-9]{2,8}[A-Z]{3}.*";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < N; i++) {
            System.out.println(sc.nextLine().matches(VALID_ID) ? VALID : INVALID);
        }
    }
}
