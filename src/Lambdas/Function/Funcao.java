package Lambdas.Function;

import java.util.function.Function;

public class Funcao {
  public static void main(String[] args) {
    // Primeiro tipo eh  valor de entrada, o segundo o valor de saida.
    Function<Integer, String> parOuImpar =
             numero -> numero % 2 == 0 ? "Par" : "Impar";

    System.out.println(parOuImpar.apply(3));

    Function<String, String> resultado =
            valor -> "O resultado eh: " + valor;

    Function <String, String> toma = valor -> valor + "!!!";

    // composicao de funcaes
    String resultadoFinal = parOuImpar
                    .andThen(resultado)
                    .andThen(toma)
                    .apply(32);

    System.out.println(resultadoFinal);
  }
}
