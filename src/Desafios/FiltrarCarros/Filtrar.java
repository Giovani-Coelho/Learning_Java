package Desafios.FiltrarCarros;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filtrar {
  public static void main(String[] args) {

    Carro car1 = new Carro("Camaro", "Chevrolet", 200_000.00,  461);
    Carro car2 = new Carro("Monza", "Chevrolet", 15_000.00,  259);
    Carro car3 = new Carro("Sandeiro", "Renault", 27_000.00,  230);
    Carro car4 = new Carro("Duster", "Renault", 67_000.00,  298);
    Carro car5 = new Carro("Ford GT", "Ford", 357_000.00,  572);

    List<Carro> carros = Arrays.asList(car1,car2,car3,car4,car5);

    Predicate<Carro> brand = car -> Objects.equals(car.marca, "Chevrolet");
    Predicate<Carro> power = car -> car.potencia >= 250;
    Function<Carro, String> optionCar =
            car -> "Resultado: " +
                    car.nome + " - " + car.marca + " - " +
                    "Potencia: " + car.potencia + " - " + "R$" + car.preco;

    carros.stream()
            .filter(brand)
            .filter(power)
            .map(optionCar)
            .forEach(System.out::println);
  }
}
