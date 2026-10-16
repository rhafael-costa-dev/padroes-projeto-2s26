package main.java.observer.pattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CanalYouTube implements Subject {
    private String tituloVideo;
    private Set<Observer> inscritos;

    public CanalYouTube() {
        this.inscritos = new HashSet<>();
    }

    public void publicarVideo(String titulo) {
        this.tituloVideo = titulo;
        this.notificar();
    }

    @Override
    public void notificar() {
        this.inscritos.forEach(o -> {
            o.atualizar("Novo video publicado no canal com titulo " + tituloVideo);
        });

    }

    @Override
    public void remover(Observer observer) {
        if (this.inscritos == null || this.inscritos.isEmpty()) {
            return;
        }
        this.inscritos.remove(observer);
    }

    @Override
    public void adicionar(Observer observer) {
        if (this.inscritos == null) {
            return;
        }
        this.inscritos.add(observer);
    }
}
