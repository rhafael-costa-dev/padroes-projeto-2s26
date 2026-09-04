package main.java;

import main.java.srp.GerenciadorTarefasFull;

public class TesteSRP {
    public static void main(String[] args) {
        var gerTarefas = new GerenciadorTarefasFull();
        System.out.println(gerTarefas.conectarAPI());
        gerTarefas.criarTarefa();
        gerTarefas.atualizarTarefa();
        gerTarefas.removerTarefa();
        gerTarefas.enviarNotificacao();
        gerTarefas.produzirRelatorio();
        gerTarefas.enviarRelatorio();
    }
}