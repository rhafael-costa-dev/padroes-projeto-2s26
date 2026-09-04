package main.java;

import main.java.dip.*;

public class TesteSolidDIP {

    public static void main(String[] args) {

        var pedido = new PedidoService(new PedidoRepositoryPostgres());
        pedido.processarPedido(new Pedido("Banana", 12.00, 0));
    }

}

