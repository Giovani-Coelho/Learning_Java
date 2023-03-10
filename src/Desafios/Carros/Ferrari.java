package Desafios.Carros;

public class Ferrari extends Carro {

  public Ferrari() {
    super();
  }

  public Ferrari(int MaxSpeed) {
    super(MaxSpeed);
  }

  @Override
  public void acelerar() {
    super.acelerar(25);
  }
}
