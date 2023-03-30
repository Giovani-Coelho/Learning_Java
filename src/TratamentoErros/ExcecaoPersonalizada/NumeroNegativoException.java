package TratamentoErros.ExcecaoPersonalizada;

public class NumeroNegativoException extends RuntimeException{
  private final String nomeDoAtributo;

  public NumeroNegativoException(String nomeDoAtributo) {
    this.nomeDoAtributo = nomeDoAtributo;
  }

  public String getMessage() {
    return String.format("O atributo %s esta negativo", nomeDoAtributo);
  }
}
