package TratamentoErros.ExcecaoPersonalizada2;

import TratamentoErros.Aluno;

public class TestValidacoes {
  public static void main(String[] args) {
  try {
    Aluno aluno = new Aluno("", 7);
    Validar.aluno(aluno);
  } catch (StringVaziaException err) {
    System.out.println(err.getMessage());
  } catch (NumeroNegativoException err) {
    System.out.println(err.getMessage());
  }
    System.out.println("Fim :)");
  }
}
