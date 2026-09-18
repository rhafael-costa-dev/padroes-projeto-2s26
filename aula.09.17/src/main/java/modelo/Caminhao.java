package main.java.modelo;

public class Caminhao implements Transporte {

    @Override
    public void iniciarTrajeto() {
        System.out.println("Trajeto do caminhão iniciado......");
    }

    @Override
    public void finalizarTrajeto() {
        System.out.println("Trajeto do caminhão finalizado......");
    }

}
