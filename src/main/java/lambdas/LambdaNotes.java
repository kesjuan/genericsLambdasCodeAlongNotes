package lambdas;

public class LambdaNotes {
    // A lambda expression implements a functional interface
    // A lambda expression is not another way of writing instances of anonymous classes
    // functional interface - has only one abstract method, can have many default and static methods

    //1. copy and paste the block of parameters
    //2. draw an arrow ->
    //3. provide an implementation
    // java.util.function toolbox is a set of functional interfaces . 4 major categories
    // ?^ 1. Supplier 2.Consumer 3. Predicate 4. Function
    //  INTERFACE               //METHOD            // EXAMPLE
    // Supplier<T>              // T get()              () -> "Hello";
    // Consumer<T>              // void accept(T t)// () -> System.out.print.ln(s)
    // Predicate<T>             //boolean test(T t)// string -> string.isEmpty();
    // Function<T,R>            // R apply(T t)    // user -> user.getName();
    // ! You can  create new lambdas by using existing lambdas
    // * when you have two or more parameters in your lambda you need to keep the parentheses
}
