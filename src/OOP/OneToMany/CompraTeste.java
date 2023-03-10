package OOP.OneToMany;

public class CompraTeste {
  public static void main(String[] args) {
    Compra c1 = new Compra();
    c1.cliente = "Giovani";
    c1.adicionarCompra("caneta", 10, 7.90);
    c1.adicionarCompra("Lapis", 20, 1.90);

    System.out.println(c1.valorTotal());
  }
}
