package TratamentoErros.Check;

public class CheckedVsUnchecked {
  public static void main(String[] args) {
    geraErro1();
    try {
      geraErro2();
    } catch (Exception err) {
      System.out.println("Erooou");
    }
  }

  public static void geraErro1() {
    throw new RuntimeException("erro doido #01!");
  }

  // se esse erro lancado nao for tratado temos que usar excecao checada
  public static void geraErro2() throws Exception {
   throw new Exception("Errei kkkkkk #02!");
  }
}
