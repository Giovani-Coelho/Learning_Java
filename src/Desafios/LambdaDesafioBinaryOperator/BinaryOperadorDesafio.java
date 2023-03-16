package Desafios.LambdaDesafioBinaryOperator;

import Lambdas.Predicate.Produto;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BinaryOperadorDesafio {
  public static void main(String[] args) {
    Produto p = new Produto("iPad", 3235.89, 13);

    Function<Produto, Double> preco =
            valor -> valor.preco * (1 - valor.desconto / 100);

    UnaryOperator<Double> imposto =
            valor -> valor >= 2500 ? ((8.5 / 100) * valor) + valor : valor;

    UnaryOperator<Double> frete =
            valor -> valor >= 3000 ? valor + 100 : valor + 50;
    // Converter Double para string
    UnaryOperator<Double> arredondar = valor ->
            Double.parseDouble(new DecimalFormat(".##").format(valor));

    Function<Double, String> formatar = valor -> ("R$" + valor).replace(".", ",");

    System.out.println(preco.apply(p));
    String precoFinal = preco
            .andThen(imposto)
            .andThen(frete)
            .andThen(arredondar)
            .andThen(formatar)
            .apply(p);

  }
}
