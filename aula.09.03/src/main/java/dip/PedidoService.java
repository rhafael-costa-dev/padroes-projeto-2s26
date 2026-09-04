package main.java.dip;

public class PedidoService {

    private PedidoRepository repository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.repository =  pedidoRepository;
    }

    public void processarPedido(Pedido pedido) {
        if (pedido.nome == null)
            throw new IllegalArgumentException();

        if (pedido.valor == null || pedido.valor <= 0)
            throw new IllegalArgumentException();

        // Lógica de processamento do pedido
        repository.salvarPedido(pedido);
    }

}

