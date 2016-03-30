package funk.shane.interview;

/**
 * AKA: You have 2 string, one smaller, one larger…write an algorithm to figure out how many permutations
 * of the smaller string exist in the bigger string.
 */
public class StringPerms1 {
    public StringPerms1() {    }

    public int numOfPerms(final String str1, final String str2) {
        int total = 0;
        String smaller, larger;
        if(str1.length() - str2.length() >= 0) {
            smaller = str2;
            larger = str1;
        }
        else {
            smaller = str1;
            larger = str2;
        }

        final char[] smallChar = smaller.toCharArray();

        for(int i = 0; i < larger.length();) {
            try {
                String substr  = larger.substring(i, smaller.length());
                char[] subChar = substr.toCharArray();
                
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return total;
    }

    private int countSubPerms(final char[] smaller, final char[] substr) {
        int x = 0;

        return x;
    }

    public static void main(String[] args) {
        StringPerms1 sp1 = new StringPerms1();

        System.out.printf("sp1 number of perms with str1: %s str2: %s", "", "");
    }
}
