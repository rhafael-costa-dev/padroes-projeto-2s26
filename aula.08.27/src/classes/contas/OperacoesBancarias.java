package classes.contas;

public interface OperacoesBancarias {

    void sacar(Double valor);
    void depositar(Double valor);
    void imprimirExtrato();

}
