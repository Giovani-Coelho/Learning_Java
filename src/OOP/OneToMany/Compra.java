package OOP.OneToMany;

import java.util.ArrayList;

public class Compra {
  String cliente;

  ArrayList<Item> itens = new ArrayList<>();

  // Fumcao que automaticamente vai colocar a compra dentro do item

  public void adicionarCompra(String nome, int quantidade, double preco) {
    itens.add(new Item(nome, quantidade, preco));
    // o parametro do objeto compra dentro do objeto item faz referencia a esse objeto compra;
    //item.compra = this;
  }

  public double valorTotal() {
    double total = 0;

    for(Item item : itens) {
      total += item.quantidade * item.preco;
    }

    return total;
  }

}
