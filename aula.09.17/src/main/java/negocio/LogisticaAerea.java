package main.java.negocio;

import main.java.modelo.Aviao;
import main.java.modelo.Caminhao;
import main.java.modelo.Transporte;

public class LogisticaAerea extends Logistica {

    @Override
    public Transporte criar() {
        return new Aviao();
    }
}
