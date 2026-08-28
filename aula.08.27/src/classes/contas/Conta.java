package classes.contas;

public class Conta {

    private Integer numero;
    private Integer agencia;
    protected Double saldo;

    public Conta(Integer agencia, Integer numero) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = Double.MIN_VALUE;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Double getSaldo() {
        return saldo;
    }
}
