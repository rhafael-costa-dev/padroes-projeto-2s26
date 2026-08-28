import classes.contas.ContaCorrente;
import classes.contas.ContaPoupanca;
import classes.contas.OperacoesBancarias;
import excecoes.SaldoInsuficiente;

public class TesteInterfaceContas {

    public static void main(String[] args) {
        OperacoesBancarias cp = new ContaPoupanca(123, 8456856);
        OperacoesBancarias cc =  new ContaCorrente(123, 1239879);

        System.out.println("######################");
        System.out.println("Operações na CP");
        cp.depositar(1000.00);
        sacar(cp, 150.00);
        cp.depositar(350.00);
        sacar(cp, 5000.00);
        cp.imprimirExtrato();

        System.out.println("######################");
        System.out.println("Operações na CC");
        cc.depositar(100.00);
        cc.depositar(4500.00);
        sacar(cc, 200.00);
        cc.imprimirExtrato();
    }

    private static void sacar(OperacoesBancarias op, double valor) {
        try {
            op.sacar(valor);
        } catch (SaldoInsuficiente s) {
            System.out.println(s.getMessage());
            s.printStackTrace();
        }

    }

}
