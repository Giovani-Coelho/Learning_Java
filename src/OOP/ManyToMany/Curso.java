package OOP.ManyToMany;

import java.util.ArrayList;

public class Curso {
  final String nome;
  final ArrayList<Aluno> alunos = new ArrayList<>();

  Curso(String nome) {
    this.nome = nome;
  }

  public void adicionarAluno(Aluno aluno) {
    this.alunos.add(aluno);
  }
}
