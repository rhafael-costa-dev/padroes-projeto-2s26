package main.java.dip;

public class PedidoRepositoryPostgres implements PedidoRepository {

    public void salvarPedido(Pedido pedido) {
        var r = pedido.valor * pedido.quatidade;
        if (r <= 0) {
            throw new UnsupportedOperationException();
        }

        System.out.println("Salvando dados do pedido no Postgres");
    }

}
