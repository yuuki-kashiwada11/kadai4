
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        names.stream().filter(name -> name.contains(("a"))).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
