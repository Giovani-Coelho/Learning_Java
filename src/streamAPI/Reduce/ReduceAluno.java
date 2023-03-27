package streamAPI.Reduce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ReduceAluno {
  public static void main(String[] args) {
    Aluno a2 = new Aluno("Teteu", 6.1);
    Aluno a3 = new Aluno("Pirituba", 8.1);
    Aluno a4 = new Aluno("Sergio", 7.1);
    Aluno a1 = new Aluno("Giovani", 10);


    List<Aluno> alunos = Arrays.asList(a2, a3, a4, a1);

    Predicate<Aluno> aprovado = a -> a.nota >= 7;
    Function<Aluno, Double> apenasNota = a -> a.nota;

    // recebe <Media> e <Double>, retorna Type<Media>
    BiFunction<Media, Double, Media> calcularMedia =
            (media, nota) -> media.adicionar(nota);

    BinaryOperator<Media> combinarMedia =
            (m1,m2) -> Media.combinar(m1,m2);

    Media media = alunos.parallelStream()
            .filter(aprovado)
            .map(apenasNota)
            // o new Media() eh onde vai acomular a nota na variavel interna.
            .reduce(new Media(), calcularMedia, combinarMedia);

    System.out.println(media.getValor());

    System.out.println(alunos.stream().anyMatch(aprovado));

    Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
      if(aluno1.nota > aluno2.nota) {
        System.out.println("-----------------");
        System.out.println(aluno1);
        System.out.println(aluno2);
        return 1;
      };
      if(aluno1.nota < aluno2.nota) {
        System.out.println("AAAAAAAAAAAAAAAAA");
        System.out.println(aluno1);
        System.out.println(aluno2);
        return -1;
      };

      return 0;
    };

    System.out.println("Resposta" + alunos.stream().max(melhorNota).get());
  }
}
