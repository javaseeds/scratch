package funk.shane.hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by Shane on 1/16/2016.
 */
public class Caesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        char[] S = (sc.nextLine()).toCharArray();
        int K = Integer.parseInt(sc.nextLine()) % 26;

        for(int i = 0; i < S.length; i++) {
            if(Character.isLetter(S[i])) {
                if(Character.isUpperCase(S[i])) {
                    S[i] = encode(S[i], K, 'A', 'Z');
                }
                else if(Character.isLowerCase(S[i])) {
                    S[i] = encode(S[i], K, 'a', 'z');
                }
            }
        }
        System.out.println(S);
    }

    private static char encode(char targetChar, int key, char lowerChar, char upperChar) {
        char ch;
        int delta;
        int offset = 1;  // array offset for calculation
        if(targetChar + key > upperChar) {
            delta = (targetChar + key) - (upperChar + offset);
            ch = (char)(lowerChar + delta);
        }
        else {
            ch = (char) (targetChar + key);
        }

        return ch;
    }
}
