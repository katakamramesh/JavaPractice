import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapExample {

    public static void main(String[] args) {
        List<List<String>> ll = Arrays.asList(
                Arrays.asList("apple","mango"),
                Arrays.asList("grape","pomegranate")
        );
        List<String> p = ll.stream().flatMap(Collection::stream).toList();
        System.out.println(p);
    }
}
