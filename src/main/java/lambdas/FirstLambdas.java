package lambdas;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLambdas {
    public static void main(String[] args) {
        Supplier<String> supplier =
                ()          ->              "Hello";
        //       ^c/p param  ^ draw arrow       ^ implementation
        String string = supplier.get();
        System.out.println(string);

        Consumer<String> consumer = (String s) -> {
            // can run multiple blocks of code using curly braces
            System.out.println("Inside consumer");
            System.out.println(s);
        };
        consumer.accept("Mello");
    }
}
