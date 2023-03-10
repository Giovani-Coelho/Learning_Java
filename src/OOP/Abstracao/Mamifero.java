package OOP.Abstracao;

public abstract class Mamifero extends Animal{
  public final String mover() {
    return "se movendo...";
  }

  public abstract String mamar();
}
