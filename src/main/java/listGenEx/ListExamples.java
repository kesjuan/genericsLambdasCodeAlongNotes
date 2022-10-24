package listGenEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExamples {


    public static void main(String[] args) {
        Person donDraper = new Person("Don Draper", 89);
        Person peggy = new Person("Peggy Olson", 65);

        List<Person> madMen = new ArrayList<>();
        madMen.add(donDraper);
        madMen.add(peggy);
        System.out.println(madMen);

        madMen.add(new Person("Bert Cooper",100));

        Collections.sort(madMen, new AgeComparator());
        System.out.println(madMen);
        // ! Anonymous Class
//        Collections.sort(madMen, new Comparator<Person>() {
//            @Override
//            public int compare(Person person1, Person person2) {
//                return Integer.compare(person1.getAge(),person2.getAge());
//            }
//        });
    Collections.sort(madMen, new ReverseComparator<>(new AgeComparator()));
        System.out.println(madMen);

        final Person youngestCastMember = min(madMen, new AgeComparator());
        System.out.println(youngestCastMember);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println(min(numbers, Integer::compare));
    }
   public static <T> T min(List<T> values, Comparator<T> comparator){
        //!    ^^^ generics will be used and method returns a generic
       //! Any type of list can be passed in also any type of comparator can be used
        if (values.isEmpty()){
        throw new IllegalArgumentException("List is empty");
        }
        T lowestElement = values.get(0);
       for (int i = 1; i < values.size(); i++) {
           final T element = values.get(i);
           if (comparator.compare(element,lowestElement) < 0){
               lowestElement = element;
           }
       }
       return lowestElement;
    }
}
