package OOP.ManyToMany;

public class CursoTest {
  public static void main(String[] args) {
    Aluno a1 = new Aluno("Givani");
    Aluno a2 = new Aluno("Coelho");

    Curso c1 = new Curso("Java");
    Curso c2 = new Curso("Node");

    c1.adicionarAluno(a1);
    c2.adicionarAluno(a2);
    a2.adicionarCurso(c2);

    a1.adicionarCurso(c2);
    a1.adicionarCurso(c1);

    for(Curso curso : a2.cursos) {
      System.out.println(curso.nome);
    }
  }
}
