package main.java.negocio;

import main.java.modelo.Navio;
import main.java.modelo.Transporte;

public class LogisticaMaritima extends Logistica {
    @Override
    public Transporte criar() {
        return new Navio();
    }

}
