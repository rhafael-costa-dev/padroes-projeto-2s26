package main.java.modelo;

public class Navio implements Transporte {

    @Override
    public void iniciarTrajeto() {
        System.out.println("Trajeto do navio iniciado......");
    }

    @Override
    public void finalizarTrajeto() {
        System.out.println("Trajeto do navio finalizado......");
    }

}
