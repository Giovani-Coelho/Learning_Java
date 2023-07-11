package JDBC;

public class Pessoa {
    private int cod;
    private String name;

    public Pessoa(int cod, String name) {
        this.cod = cod;
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
