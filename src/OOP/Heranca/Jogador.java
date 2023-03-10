package OOP.Heranca;
public class Jogador {

  int vida = 100;
  int y;
  int x;
  int dano;

  Jogador() {
    this.dano = 10;
  }

  Jogador(int dano) {
    this.dano = dano;
  }

  public void atacar(Jogador oponent) {

    int deltaX = Math.abs(x - oponent.x);
    int deltaY = Math.abs(y - oponent.y);

    if(deltaX == 0 && deltaY == 1) {
      if (oponent.vida < 0) {
        oponent.vida = 0;
        return;
      }
      oponent.vida -= dano;

    } else if(deltaX == 1 && deltaY == 0) {
      if(oponent.vida < 0) {
        oponent.vida = 0;
        return;
      }
      oponent.vida -= dano;
    }
  }

  public void andar(Direcao direcao) {
    switch (direcao) {
      case NORTE -> y--;
      case LESTE -> x++;
      case SUL -> y++;
      case OESTE -> x--;
    }
  }
}
