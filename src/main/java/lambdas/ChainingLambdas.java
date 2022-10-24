package lambdas;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ChainingLambdas {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println("c1 consumes " + s);
        Consumer<String> c2 = s -> System.out.println("c2 consumes " + s);

        Consumer<String> c3 = c1.andThen(c2);



//    Consumer<String> c3 = s -> {
//        c1.accept(s);
//        c2.accept(s);
//    };
    c3.accept("Hello");
        Predicate<String> isNull = s -> s == null;
        System.out.println("for null =" + isNull.test(null));
        System.out.println("For Hello =" + isNull.test("Hello"));

        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("for empty =" + isEmpty.test(""));
        System.out.println("for hello =" + isEmpty.test("Hello"));

        Predicate<String> p = isNull.negate().and(isEmpty.negate());
        System.out.println("for null =" + p.test(null));
        System.out.println("for empty =" + p.test(""));
        System.out.println("for hello =" + p.test("Hello"));

    }
}
