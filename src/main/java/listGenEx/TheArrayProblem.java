package listGenEx;

import java.util.Arrays;

public class TheArrayProblem {
    public static void main(String[] args) {


        Person donDraper = new Person("Don Draper", 89);
        Person peggy = new Person("Peggy Olson", 65);

        Person[] madMen = {donDraper, peggy};
        System.out.println(Arrays.toString(madMen));

        Person bert = new Person("Bert Cooper", 100);
        madMen = add(bert, madMen);
        System.out.println(Arrays.toString(madMen));
    }
    private static Person[] add(final Person person, Person[] array){
        final int length = array.length;
        array = Arrays.copyOf(array, array.length+1);
        array[length] = person;
        return array;
    }

}
