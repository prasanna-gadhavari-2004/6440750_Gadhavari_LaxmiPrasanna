import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");

        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("Sorted list:");
        names.forEach(System.out::println);
    }
}