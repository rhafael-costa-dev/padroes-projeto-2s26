package main.java;

import main.java.srp.*;

public class TesteSolidSRP {
    public static void main(String[] args) {
        var conector = new ConectorAPI();
        var notificar = new Notificar();
        var tarefas = new GerenciadorTarefas();
        var relatorios =  new GerenciarRelatorios();

        System.out.println(conector.conectarAPI());
        tarefas.criarTarefa();
        tarefas.atualizarTarefa();
        tarefas.removerTarefa();
        notificar.enviarNotificacao();
        relatorios.produzirRelatorio();
        relatorios.enviarRelatorio();
    }
}