package main.java.srp;
public class GerenciadorTarefasFull {

    public String conectarAPI(){
        return "http://localhost:8080";
    }

    public void criarTarefa(){
        System.out.println("Criando nova tarefa");
    }

    public void atualizarTarefa(){
        System.out.println("Atualizando a tarefa");
    }

    public void removerTarefa(){
        System.out.println("Removendo a tarefa");
    }

    public void enviarNotificacao(){
        System.out.println("Enviando a notificação");
    }

    public void produzirRelatorio(){
        System.out.println("Produzindo relatorio");
    }

    public void enviarRelatorio(){
        System.out.println("Enviando relatorio");
    }

}
