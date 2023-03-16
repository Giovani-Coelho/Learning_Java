package Lambdas.Operador;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
  public static void main(String[] args) {
    // aceita 2 valores, do mesmo tipo primitivo.
    BinaryOperator<Double> media =
            (n1, n2) -> (n1 + n2) / 2;

    System.out.println(media.apply(9.8, 5.7));

    // Recebe dois parametros e retorna uma String
    BiFunction<Double, Double, String> resultado =
            (n1, n2) -> (n1 + n2) / 2 >= 7 ? "Aprovado" : "Reprovado";
    System.out.println(resultado.apply(9.7, 7.1));
  }
}
