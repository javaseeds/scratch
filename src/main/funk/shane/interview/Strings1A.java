package funk.shane.interview;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Suppose you have given two strings S1 and S2. Find out if S1 is substring of S2. If S1 is present in S2 return
 * starting index of S1 in S2 and if not present return -1.
 */
public class Strings1A {
    public static void main(String[] args) {
        final Map<String, String> mapStr = new ConcurrentHashMap<>();
        mapStr.put("now", "knowledge");
        mapStr.put("cow", "cow");
        mapStr.put("not", "knowledge");
        mapStr.put("edge", "knowledge");
        mapStr.put("pledge", "edge");
        mapStr.put("flag", "flagstaff");
        mapStr.put("tuv", "abcdefghijklmnopqrstuvwxyz");

        getIndex(mapStr);
    }

    private static void getIndex(final Map<String, String> strMap) {
        for(Map.Entry<String, String> entry : strMap.entrySet()) {
            int index = getIndex(entry.getKey(), entry.getValue());
            System.out.printf("index of substring '%s' from '%s': %d%n", entry.getKey(), entry.getValue(), index);
        }
    }

    private static int getIndex(final String s1, final String s2) {
        int index = s2.length() - s1.length();

        if (index > 0) {
            char ch1 = s1.charAt(0);
            for(int i = 0; i < s2.length(); i++) {
                if(ch1 == s2.charAt(i)) {
                    try {
                        String tmp = s2.substring(i, i + s1.length());
                        if(s1.equals(tmp)) {
                            return i;
                        }
                    } catch (StringIndexOutOfBoundsException e) {
                        return -1;
                    }
                }
                index = -1;
            }
        }
        else if (index < 0) {
            index = -1;
        }

        return index;
    }
}
