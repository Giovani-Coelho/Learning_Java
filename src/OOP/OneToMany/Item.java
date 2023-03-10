package OOP.OneToMany;

public class Item {
  String nome;
  int quantidade;
  double preco;
  // para umc dependencia bidirecional
  Compra compra;

  Item(String nome, int quantidade, double preco) {
    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
  }
}
