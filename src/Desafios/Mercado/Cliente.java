package Desafios.Mercado;

import java.util.ArrayList;

public class Cliente {
  String nome;

  ArrayList<Compra> compras = new ArrayList<>();

  Cliente(String nome) {
    this.nome = nome;
  }

  public double valorTotal() {
    double total = 0;
    for(Compra c : compras) {
      total +=  c.valorTotal();
    }

    return total;
  }

}
