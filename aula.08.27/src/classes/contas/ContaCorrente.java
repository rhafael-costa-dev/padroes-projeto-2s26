package classes.contas;

import excecoes.SaldoInsuficiente;

public class ContaCorrente extends Conta implements OperacoesBancarias {

    public ContaCorrente(Integer agencia, Integer numero) {
        super(agencia, numero);
    }

    @Override
    public void sacar(Double valor) {
        if (this.saldo < valor) {
            throw new SaldoInsuficiente("Saldo insuficiente!");
        }
        this.saldo -= valor;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Relatório");
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Conta Corrente: " + this.getNumero());
        System.out.println("Saldo: "  + this.getSaldo());
    }

}
