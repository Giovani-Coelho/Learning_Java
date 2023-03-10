package Desafios;

public class OperacaoAritmetica {
  public static void main(String[] args) {
    double numA = Math.pow(( 6 * ( 3 + 2 )), 2 );
    double denA = 3 * 2;

    double numB = ( 1 - 5 ) * ( 2 - 7 );
    double denB = 2;

    double resA = numA / denA;
    double resB = Math.pow(numB / denB, 2);

    double sup =  Math.pow(resA - resB, 3);
    double inf =  Math.pow(10, 3);

    double res = sup / inf;

    System.out.println(res);
  }
}
