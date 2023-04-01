public class ContaTerminal {
  private Integer numeroConta;
  private String agencia;
  private String nomeCliente;
  private Double saldoConta;

  public ContaTerminal ( Integer numeroConta , String agencia , String nomeCliente , Double saldoConta ) {
    this.numeroConta = numeroConta;
    this.agencia = agencia;
    this.nomeCliente = nomeCliente;
    this.saldoConta = saldoConta;
  }

  public Integer getNumeroConta ( ) {
    return numeroConta;
  }

  public void setNumeroConta ( Integer numeroConta ) {
    this.numeroConta = numeroConta;
  }

  public String getAgencia ( ) {
    return agencia;
  }

  public void setAgencia ( String agencia ) {
    this.agencia = agencia;
  }

  public String getNomeCliente ( ) {
    return nomeCliente;
  }

  public void setNomeCliente ( String nomeCliente ) {
    this.nomeCliente = nomeCliente;
  }

  public Double getSaldoConta ( ) {
    return saldoConta;
  }

  public void setSaldoConta ( Double saldoConta ) {
    this.saldoConta = saldoConta;
  }

  @Override
  public String toString ( ) {
    return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + ", conta " + numeroConta + " e o seu saldo de R$ " + saldoConta + " já está disponível para saque.";

  }
}
