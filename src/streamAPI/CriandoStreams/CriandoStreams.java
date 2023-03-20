package streamAPI.CriandoStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
  public static void main(String[] args) {

    Consumer<String> print = System.out::print;
    Consumer<Integer> println = System.out::println;

    Stream<String> langs = Stream.of("Java ", "Node ", "Python\n");
    langs.forEach(print);

    String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
    Stream.of(maisLangs).forEach(print);

    // mostrar apenas um item
    Arrays.stream(maisLangs, 1,2).forEach(print);

    List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
    outrasLangs.stream().forEach(print);
    System.out.println("Stream paralelo");
    outrasLangs.parallelStream().forEach(print);

    // stream infinita
    //Stream.generate(() -> "a").forEach(print);
    //Stream.iterate(0, n -> n + 1).forEach(println);
  }
}
