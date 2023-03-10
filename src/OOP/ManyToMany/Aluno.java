package OOP.ManyToMany;

import java.util.ArrayList;

public class Aluno {
  String nome;
  ArrayList<Curso> cursos = new ArrayList<>();

  Aluno(String nome) {
    this.nome = nome;
  }

  public void adicionarCurso(Curso curso) {
    this.cursos.add(curso);
    curso.alunos.add(this);
  }
}
