package OOP.Abstracao;

public class Vida {
  public static void main(String[] args) {
    Mamifero dog = new Cachorro();
    System.out.println(dog.mamar());
    System.out.println(dog.respire());
    System.out.println(dog.mover());
  }
}
