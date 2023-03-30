package TratamentoErros;

public class Basic {
  public static void main(String[] args) {
    Aluno a1 = null;

    try {
      imprimirAluno(a1);
    } catch (Exception err) {
      System.out.println("ocorreu um erro ao imprimir o nome do usuario");
    }

    try {
      System.out.println(7 / 0);
    } catch (ArithmeticException err) {
      System.out.println("Erro: "  + err.getMessage());
    }
  }

  public static void imprimirAluno(Aluno aluno) {
    System.out.println(aluno.nome);
  }
}
