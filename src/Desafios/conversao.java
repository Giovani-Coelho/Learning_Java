package Desafios;
import java.util.Scanner;
public class conversao {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String salario1 = input.nextLine().replace(",", ".");
    String salario2 = input.nextLine().replace(",", ".");
    String salario3 = input.nextLine().replace(",", ".");

    double valor1 = Double.parseDouble(salario1);
    double valor2 = Double.parseDouble(salario2);
    double valor3 = Double.parseDouble(salario3);

    double val = (valor1 + valor2 + valor3) / 3;

    System.out.printf("%.2f", val);

    input.close();
  }
}
