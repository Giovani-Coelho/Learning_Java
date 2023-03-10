package OOP.Heranca;

public class Jogo {
  public static void main(String[] args) {
    Heroi H1 = new Heroi(50);
    H1.x = 10;
    H1.y = 10;

    Jogador p2 = new Jogador();
    p2.x = 10;
    p2.y = 11;

    System.out.println(H1.vida);
    System.out.println(p2.vida);

    H1.atacar(p2);
    p2.atacar(H1);

    System.out.println("Heroi = " + H1.vida);
    System.out.println("Player = " + p2.vida);
  }
}
