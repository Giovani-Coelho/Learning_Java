package Desafios.Carros;

public class Monza extends Carro {
 public Monza() {
   super();
 }

 public Monza(int MaxSpeed) {
   super(MaxSpeed);
 }


  @Override
  public void acelerar() {
    super.acelerar(10);
  }
}
