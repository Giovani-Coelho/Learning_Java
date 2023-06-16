package Generics.Basic;

public class CaixaTest {
  public static void main(String[] args) {
    Caixa<String> caixaA = new Caixa<>();
    caixaA.guardar("Livro");

    System.out.println(caixaA.abrir());

    Caixa<Integer> caixaB = new Caixa<>();
    caixaB.guardar(999);

    System.out.println(caixaB.abrir());
  }
}
