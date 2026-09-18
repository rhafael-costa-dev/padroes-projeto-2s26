package main.java.negocio;

import main.java.modelo.Caminhao;
import main.java.modelo.Navio;
import main.java.modelo.Transporte;

public class AplicacaoLogistica {

    public Transporte alocar(String tipo) {
        if (tipo.equals("Maritimo")) {
            return new Navio();
        }

        if (tipo.equals("Viario")) {
            return new Caminhao();
        }

        return null;
    }

    public Logistica criarRomaneo(String tipo) {

        switch (tipo) {
            case "Aerea": return new LogisticaAerea();
            case "Viaria": return new LogisticaViaria();
            case "Maritima": return new LogisticaMaritima();
            default: return null;
        }

    }

}
