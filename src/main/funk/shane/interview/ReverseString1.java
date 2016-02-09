package funk.shane.interview;

import java.util.Stack;

/**
 * http://www.geeksforgeeks.org/reverse-an-array-without-affecting-special-characters/
 * Input:   str = "a,b$c"
 * Output:  str = "c,b$a"
 * Note that $ and , are not moved anywhere.
 * Only subsequence "abc" is reversed
 * <p>
 * Input:   str = "Ab,c,de!$"
 * Output:  str = "ed,c,bA!$"
 */
public class ReverseString1 {
    public ReverseString1() {    }

    /* Note: this implementation approaches N^2 - not good first try */
    public String reverseMe(final char[] origStr) {
        final char[] reverse = new char[origStr.length];
        final Stack<Character> stack = new Stack<>();

        for(int i = 0; i < origStr.length; i++) {
            if(Character.isAlphabetic(origStr[i])) {
                stack.push(origStr[i]);
                reverse[i] = ' ';
            }
            else {
                reverse[i] = origStr[i];
            }
        }

        for(int i = 0; i < reverse.length; i++) {
            if(Character.isWhitespace(reverse[i])) {
                reverse[i] = stack.pop();
            }
        }

        return new String(reverse);
    }

    public static void main(String[] args) {
        final String str1 = "Ab,c,de!$";
        ReverseString1 rs1 = new ReverseString1();
        System.out.printf("str1 '%s' with only chars reversed '%s'%n", str1, rs1.reverseMe(str1.toCharArray()));
    }
}
