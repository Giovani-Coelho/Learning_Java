package TratamentoErros.ExcecaoPersonalizada2;

public class NumeroNegativoException extends Exception{
  private final String nomeDoAtributo;

  public NumeroNegativoException(String nomeDoAtributo) {
    this.nomeDoAtributo = nomeDoAtributo;
  }

  public String getMessage() {
    return String.format("O atributo %s esta negativo", nomeDoAtributo);
  }
}
