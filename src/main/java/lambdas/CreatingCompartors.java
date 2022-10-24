package lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class CreatingCompartors {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two","three","four","five","six","seven","eight","nine");
        Comparator<String> comparator = ( s1,  s2) -> s1.compareTo(s2);
        strings.sort(comparator);
        System.out.println(strings);
            //////
        Function<String,Integer> toLength = s -> s.length();
        Comparator<String> cmp2 = Comparator.comparing(toLength);
            //////
        ToIntFunction<String> toLength2 = s -> s.length();
        Comparator<String> cmp3 = Comparator.comparingInt(toLength2);

            ///////
        Comparator<String> comparator1 = ( s1,  s2) -> Integer.compare(s1.length(), s2.length());
        strings.sort(comparator1);
        System.out.println(strings);
    }
}
