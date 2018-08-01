package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo {

        public static void main(String args[]) {

            System.out.println("Streams in Java 8: ");
            // Count empty strings
            List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
            System.out.println("List: " +strings);

            System.out.println("Before Java 8:");
            // Count empty strings by not using JAVA 8
            long count = getCountEmptyString(strings);
            System.out.println("Empty Strings: " + count);

            count = strings.stream().filter(string->string.isEmpty()).count();
            System.out.println("Empty Strings: " + count);

            count = strings.stream().filter(string -> string.length() == 3).count();
            System.out.println("Strings of length 3: " + count);

            //Eliminate empty string
            List<String> filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
            System.out.println("Filtered List: " + filtered);

            //Eliminate empty string and join using comma.
            String mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
            System.out.println("Merged String: " + mergedString);

            List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

            //get list of square of distinct numbers
            List<Integer>squaresList = numbers.stream().map( i ->i*i).distinct().collect(Collectors.toList());
            System.out.println("Squares List: " + squaresList);

            //print ten random numbers
            Random random = new Random();
            random.ints().limit(10).sorted().forEach(System.out::println);

        }

    private static long getCountEmptyString(List<String> strings) {

        int count = 0;

        for(String string: strings) {

            if(string.isEmpty()) {
                count++;
            }
        }
        return count;
    }

}
