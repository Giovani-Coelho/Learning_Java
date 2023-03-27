package streamAPI.Outros;

import java.util.Arrays;
import java.util.List;

public class Outros {
  public static void main(String[] args) {
    Aluno a1 = new Aluno("Giovani", 10);
    Aluno a2 = new Aluno("Bla", 2);
    Aluno a3 = new Aluno("Giovani", 10);
    Aluno a4 = new Aluno("Bolo", 8);
    Aluno a5 = new Aluno("Giovani", 10);
    Aluno a6 = new Aluno("lol", 8);
    Aluno a7 = new Aluno("cs", 9);

    List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7);

    // a comparacao por padrao pega o endereco de memoria,
    // para fazer a comparacao com objetos temos que usar o HashCode
    alunos.stream()
            .distinct()
            .skip(2)
            .limit(3)
            .forEach(System.out::println);
  }
}
