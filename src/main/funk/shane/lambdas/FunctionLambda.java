package funk.shane.lambdas;

import java.util.function.Function;

/**
 * Created by Shane on 5/30/2015.
 */
public class FunctionLambda {
    public static void main(String[] args) {
        String greeting = "Hello ";
        Function<String, String> greeter = whom -> greeting + whom + "!";
        greetWorld(greeter);
    }

    public static void greetWorld(Function<String, String> greeter) {
        System.out.printf(greeter.apply("World"));
    }
}
