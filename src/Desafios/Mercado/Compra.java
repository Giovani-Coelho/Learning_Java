package Desafios.Mercado;

import java.util.ArrayList;

public class Compra {
  ArrayList<Item> itens = new ArrayList<>();

  public void adicionarItem(String nome, double preco, int qtd) {
    Produto produto = new Produto(nome, preco);
    this.itens.add(new Item(produto, qtd));
  }

  public double valorTotal() {
    double total = 0;
    for (Item i : itens) {
      total += i.qtd * i.produto.preco;
    }

    return total;
  }
}
