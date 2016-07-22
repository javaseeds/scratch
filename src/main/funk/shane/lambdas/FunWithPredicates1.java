package funk.shane.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

/**
 * Created by Shane
 */
public class FunWithPredicates1 {
    public static void main(String[] args) {
//        final Predicate<Integer> isOdd = (Integer i) -> i % 2 == 1;
        final Predicate<Integer> isOdd = i -> i % 2 == 1;
        final ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 4, 5, 9, 16, 19, 25, 36, 41, 49));
        displayMe(intList);

        intList.removeIf(isOdd);
        displayMe(intList);
    }

    private static void displayMe(final List<Integer> list) {
        final ListIterator<Integer> li = list.listIterator();
        while(li.hasNext()) {
            System.out.printf("%d", li.next());
            if(li.nextIndex() < list.size()) {
                System.out.printf(", ");
            }
        }
        System.out.println();
    }
}
