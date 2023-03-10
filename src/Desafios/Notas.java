package Desafios;

import java.util.Scanner;

public class Notas {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Informe quantas notas vao ser colocadas");
    int qntNotas = input.nextInt();

    double[] notas = new double[qntNotas];

    System.out.println("informe as notas");

    for (int i = 0; i < notas.length; i++) {
      double valor = input.nextDouble();
      notas[i] = valor;
    }

    double acc = 0;
    for(double nota : notas) {
      acc += nota;
    }

    double media = acc / notas.length;

    System.out.println(media);
    input.close();
  }
}
