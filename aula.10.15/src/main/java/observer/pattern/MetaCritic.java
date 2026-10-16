package main.java.observer.pattern;

public class MetaCritic implements Observer {

    @Override
    public void atualizar(String mensagem) {
        System.out.println("MetaCritic recebeu notificação -> " + mensagem);
    }
}
