package funk.shane.hackerrank.java;

import java.util.Iterator;
import java.util.Properties;
import java.util.TreeSet;

/**
 * Created by Shane on 12/5/2015.
 */
public class PropTest {

    public static void main(String[] args) {
        Properties p = System.getProperties();

        TreeSet<Object> set = new TreeSet<>();
        set.addAll(p.keySet());

        Iterator setIt = set.iterator();
        while(setIt.hasNext()) {
            final String key = (String)setIt.next();
            System.out.printf("%s=[%s]%n", key, p.get(key));
        }

    }
}
