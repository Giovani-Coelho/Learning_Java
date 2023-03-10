package Desafios.Carros;

public abstract class Carro {

  public final int MaxSpeed;
  public int acc = 0;
  public int vel;

  Carro() {
    this.MaxSpeed = 200;
  }

  Carro(int MAXVEL) {
    this.MaxSpeed = MAXVEL;
  }

  public void acelerar(int run) {
    vel = run;
    if(acc > MaxSpeed) {
      acc = MaxSpeed;
    } else {
      acc += run;
    }
  }

  public void freiar() {
    if(acc > 0) {
      acc -= vel;
    }
  }

  public abstract void acelerar();
}
