package Lambdas;

public class CalculoTest2 {
  public static void main(String[] args) {
    Calculo soma = (x, y) -> x + y;
    System.out.println(soma.executar(2,2));

    Calculo mult = (x, y) -> x * y;
    System.out.println(mult.executar(10, 2));
  }
}
