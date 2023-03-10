package Desafios.Mercado;

public class ClienteTest {
  public static void main(String[] args) {
    Compra c1 = new Compra();

    c1.adicionarItem("bola", 10, 2);
    c1.adicionarItem("sapato", 120, 1);

    Cliente a1 = new Cliente("Giovani");
    a1.compras.add(c1);
    System.out.println(a1.valorTotal());
  }
}
