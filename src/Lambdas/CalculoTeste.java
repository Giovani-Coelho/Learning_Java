package Lambdas;

public class CalculoTeste {
  public static void main(String[] args) {
    Calculo soma = new Soma();
    System.out.println(soma.executar(10, 20));

    soma = new Multiplicar();
    System.out.println(soma.executar(5, 2));

  }
}
