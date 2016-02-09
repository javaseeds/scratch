package funk.shane.interview;

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

    /* this implementation is better, although kinda hairy - array access is outward in nearing O(n) */
    public String reverseMe(final String origStr) {
        final char[] origStrArr = origStr.toCharArray();
        int i = 0, j = origStrArr.length - 1; // j includes offset
        char left;
        char right;

        while(i <= j) {
            if(Character.isAlphabetic(origStrArr[i])) {
                left = origStrArr[i];
            }
            else {
                i++;
                continue;
            }

            if(Character.isAlphabetic(origStrArr[j])) {
                right = origStrArr[j];
            }
            else {
                j--;
                continue;
            }

            // swap places where appropiate and increment/decrement
            origStrArr[i] = right;
            origStrArr[j] = left;
            i++; j--;
        }

        return new String(origStrArr);
    }

    public static void main(String[] args) {
        final String str1 = "Ab,c,de!$";
        ReverseString1 rs1 = new ReverseString1();
        System.out.printf("Reverse without special char %n%s%n%s%n", str1, rs1.reverseMe(str1));
    }
}
