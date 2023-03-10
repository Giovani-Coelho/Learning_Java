package Desafios.Carros.teste;

import Desafios.Carros.Ferrari;
import Desafios.Carros.Monza;

public class CarroUse {
  public static void main(String[] args) {
    Ferrari fer = new Ferrari(350);
    System.out.println("Ferrari max speed " + fer.MaxSpeed);
    fer.acelerar();
    fer.acelerar();
    fer.freiar();

    Monza mon = new Monza(250);
    System.out.println("Monza max speed " + mon.MaxSpeed);
    mon.acelerar();
    mon.acelerar();
    mon.freiar();

    System.out.println("Ferrari = " + fer.acc + "km/h");
    System.out.println("Monza = " + mon.acc + "km/h");
  }

}
