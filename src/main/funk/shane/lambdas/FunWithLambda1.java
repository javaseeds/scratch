package funk.shane.lambdas;

import java.util.stream.Stream;

/**
 * Created by Shane on 10/30/2015.
 */
public class FunWithLambda1 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(23, 45, 15, 6, 73, 66);
//        stream.map((x) -> Math.pow(x, 2) -1 )
        stream.map((x) -> x * 2 -1 )
              .forEach(System.out::println);
    }
}
