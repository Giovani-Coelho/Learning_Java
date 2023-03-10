package Desafios;

import java.util.Scanner;

public class Matriz {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("informe a quantidade de alunos");
    int qtdAlunos = input.nextInt();

    System.out.println("Informe a quantidade de notas por aluno");
    int qtdNotas = input.nextInt();

    double[][] notasTurma = new double[qtdAlunos][qtdNotas];

    double total = 0;
    for (int i = 0; i < notasTurma.length ; i++) {
      for (int j = 0; j < notasTurma[i].length; j++) {
        System.out.println("Informe as notas");
        notasTurma[i][j] = input.nextDouble();
        total += notasTurma[i][j];
      }
    }

    double media = total / (qtdNotas * qtdAlunos);

    System.out.println(media);
  }
}
