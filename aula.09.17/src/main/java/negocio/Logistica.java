package main.java.negocio;

import main.java.modelo.Transporte;

public abstract class Logistica {

    public abstract Transporte criar();

    public void planejarEntrega() {
        var transporte = criar();
        transporte.finalizarTrajeto();
        transporte.finalizarTrajeto();
    }

}
