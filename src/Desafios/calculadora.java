package Desafios;

import java.util.Scanner;

public class calculadora {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("insira o primeiro numero");
    double num1 = input.nextDouble();

    System.out.println("insira o segundo numero");
    double num2 = input.nextDouble();

    System.out.println("insira o operador");
    String op = input.next();

    double resultado = 0;
    
    switch (op) {
      case "x": {
        resultado =  num1 + num2;
        break;
      }
      case "-": {
        resultado = num1 - num2 ;
        break;
      }
      case "*": {
        resultado = num1 * num2;
        break;
      }
      case "/": {
        resultado = num1 / num2;
      }
    }

    System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
    input.close();
  }
}
