package main.java;

import main.java.observer.pattern.CanalYouTube;
import main.java.observer.pattern.MetaCritic;
import main.java.observer.pattern.Usuario;

public class TesteObserver {

    public static void main(String[] args) {
        var canal = new CanalYouTube();
        var meta = new MetaCritic();
        var ana = new Usuario("Ana");
        var joao = new Usuario("João da Rosa");
        var jose = new Usuario("Jose da Silva");

        canal.adicionar(ana);
        canal.adicionar(joao);
        canal.adicionar(jose);
        canal.adicionar(meta);
        canal.publicarVideo("Kong vs Godzila");
        canal.remover(jose);
        canal.publicarVideo("X-men");
    }

}
