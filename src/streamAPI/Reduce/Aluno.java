package streamAPI.Reduce;

public class Aluno {

  final String nome;
  final double nota;

  public Aluno (String nome, double nota) {
    this.nome = nome;
    this.nota = nota;
  }

  @Override
  // por padra o to string retona a a representacao string de um objeto
  // com @override nos mudamos sua funcao nao chamamos mais a representacao, mas algo que queremos
  public String toString() {
    return nome + " " +  nota;
  }
}
