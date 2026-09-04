package main.java.dip;

public class PedidoRepositoryMySQL implements PedidoRepository {

    public void salvarPedido(Pedido pedido) {
        System.out.println("Salvando dados do pedido no MySQL");
    }

}
