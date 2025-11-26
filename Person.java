import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Person {
    public static void main(String[] args) {
        // Empty List
        List<String> emptyList = Collections.emptyList();
        System.out.println("Empty List: " + emptyList);

        // Empty Stream
        Stream<String> emptyStream = Stream.empty();
        System.out.println("Empty Stream count: " + emptyStream.count());
    }
}