package main.java.negocio;

import main.java.modelo.Caminhao;
import main.java.modelo.Navio;
import main.java.modelo.Transporte;

public class LogisticaViaria extends Logistica {

    @Override
    public Transporte criar() {
        return new Caminhao();
    }
}
