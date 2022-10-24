package listGenEx;

public class GenericsNotes {
    // ! Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types)
    // ?^ to be a parameter to methods, classes, and interfaces
    // !Type parameter in brackets ex public class Printer <T>
    // * T is a general Type and will need to be specified when calling it
    // ?^ ex Printer<Integer>       printer = new Printer<>(23);
            //?       ^^ Had to specify because passing in  ^^ integer
    // * can Create a generic class
    // ?^ ex public class ClassName <T>
    // * Can specify classes that we want T to represent "Bounded Generic"
    // ?^ ex public class ClassName <T extends AnotherClass> //can be class or interface
    // * Generic Methods can be uses by putting a generic before the return type and in the parameters.
    // ?^ ex public static <T> void Method(T firstParam){}
    // ?^ Can also have multiple generics ex- public static <T, V> void Method(T firstParam, V secondParam){}
    //?^ Can also do the same with Classes
    // * Can also use generics as a Return Type
    // ?^ ex public static <T> T Method(T firstParam){}
    // ! WildCard - ? used when youre using generics and do not know that the generic type will be
    // * Upperbound WildCard - to accept only a certain class and its subclasses as parameters
    // ?^ ex List<? extends Person> persons
    // ?^ This will only accept A list of person objects or objects that are subclasses of person
    // * LowerBounded WildCard - Used to only accept a class and its parent class
    //?^ ex List<? super Person> persons
    // * UnBounded Wildcards - used when you want to do ? extends object.
    // ?^ includes just a single ?. ex - List<?>
    // ! ? extends is used primarily to get data
    // ! ? super is used primarily to put data
    // ! When you need to get and put data do not use wild cards
}
