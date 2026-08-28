package classes.contas;

import excecoes.SaldoInsuficiente;

public class ContaPoupanca extends Conta implements OperacoesBancarias {

    public ContaPoupanca(Integer agencia, Integer numero) {
        super(agencia, numero);
    }

    @Override
    public void sacar(Double valor) {
        if (this.saldo < valor) {
            var msg = String.format("Saldo insuficiente! Saldo R$ %.2f - Valor do saque R$ %.2f", saldo, valor);
            throw new SaldoInsuficiente(msg);
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
        System.out.println("Conta Poupança: " + this.getNumero());
        System.out.println("Saldo: "  + this.getSaldo());
    }

}
