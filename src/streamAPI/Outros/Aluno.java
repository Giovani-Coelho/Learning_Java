package streamAPI.Outros;

import java.util.Objects;

public class Aluno {

  final String nome;
  final double nota;

  public Aluno(String nome, double nota) {
    this.nome = nome;
    this.nota = nota;
  }

  @Override
  // por padra o to string retona a a representacao string de um objeto
  // com @override nos mudamos sua funcao nao chamamos mais a representacao, mas algo que queremos
  public String toString() {
    return nome + " " +  nota;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Aluno aluno = (Aluno) o;
    return Double.compare(aluno.nota, nota) == 0 && Objects.equals(nome, aluno.nome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, nota);
  }
}
