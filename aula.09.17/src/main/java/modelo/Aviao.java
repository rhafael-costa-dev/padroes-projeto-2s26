package main.java.modelo;

public class Aviao implements Transporte {

    @Override
    public void iniciarTrajeto() {
        System.out.println("Trajeto do avião iniciado......");
    }

    @Override
    public void finalizarTrajeto() {
        System.out.println("Trajeto do aviao finalizado......");
    }

}
