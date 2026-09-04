package main.java.dip;

import com.sun.jdi.request.StepRequest;

public class Pedido {

    public String nome;
    public Double valor;
    public Integer quatidade;

    public Pedido() {}

    public Pedido(String nome, Double valor, Integer quatidade) {
        this.nome = nome;
        this.valor = valor;
        this.quatidade = quatidade;
    }
}
