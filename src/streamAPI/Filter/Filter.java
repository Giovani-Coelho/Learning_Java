package streamAPI.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
  public static void main(String[] args) {
    Aluno a1 = new Aluno("Giovani", 10);
    Aluno a2 = new Aluno("Impostor", 5);
    Aluno a3 = new Aluno("Plinio", 8);
    Aluno a4 = new Aluno("Jacare", 8);
    Aluno a5 = new Aluno("Tamaladaca", 6);
    Aluno a6 = new Aluno("TikoTeko", 6);

    List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);

    Predicate<Aluno> aprovado = a -> a.nota >= 7;

    Function<Aluno, String> admiracao =
            a -> "Parabens " + a.nome + " Nao fez mais que o minimo";

    alunos.stream()
            .filter(aprovado)
            .map(admiracao)
            .forEach(System.out::println);
  }
}
