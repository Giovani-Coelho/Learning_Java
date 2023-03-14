package Lambdas.FunctionsLambdas;

import java.util.Arrays;
import java.util.List;

public class forEachLambdas {
  public static void main(String[] args) {
    List<String> nomes = Arrays.asList("giovani", "fulano", "pelicano", "vaticano");
    // Percorrer usando FOR
    for(String name : nomes) {
      System.out.println("FOR " + name);
    }
    // percorreer usando Function lambdas
    nomes.forEach(nome -> System.out.println("LAMBDAS " + nome));

    // lambdas foreach por referencia
    nomes.forEach(System.out::println);

    System.out.println("\nLambda passando um method");
    nomes.forEach(nome -> meuImprimir(nome));

    System.out.println("\nLambda Reference passando um method");
    nomes.forEach(forEachLambdas::meuImprimir);
  }

  static void meuImprimir(String nome) {
    System.out.println("Oi! Meu nome eh " + nome);
  }
}
