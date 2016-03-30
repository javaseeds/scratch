package funk.shane.lambdas;


import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class FunWithLambda2 {

    public static boolean isGreaterThan3(int number) {
        return number > 3;
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static void main(String[] args) {
        List<Integer> domain = Lists.newArrayList(5, 2, 4, 3, 1, 7);
        Set<Integer> set = Sets.newTreeSet(domain);
        set.forEach(x -> System.out.printf("x^2: %5.2f%n", Math.pow(x, 2)));


        Function<Integer,Integer> negateThenAbs =
            ((Function<Integer,Integer>)Math::negateExact)
                .andThen(Math::abs);

        System.out.println(negateThenAbs.apply(-25));
        System.out.println(negateThenAbs.apply(25));
    }
}
