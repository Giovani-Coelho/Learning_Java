package Desafios.Mercado;

public class Item {
  Produto produto;
  int qtd;

  // quando instanciado ele vai receber o objeto produto, e a qtd de produtos.
  Item(Produto produto, int qtd) {
    this.produto = produto;
    this.qtd = qtd;
  }
}
