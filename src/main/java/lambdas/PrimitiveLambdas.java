package lambdas;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class PrimitiveLambdas {
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> 10;
        int i = intSupplier.getAsInt();
        System.out.println(i);

        DoubleToIntFunction doubleToIntFunction = (double value) -> (int)Math.floor(value);
        int pi = doubleToIntFunction.applyAsInt(Math.PI);
        System.out.println(pi);
    }
}
