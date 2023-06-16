package Generics.Heranca;

public class CaixaIntTest {
  public static void main(String[] args) {
    CaixaInt<Integer> box = new CaixaInt<>();

    box.guardar(22);
  }
}
