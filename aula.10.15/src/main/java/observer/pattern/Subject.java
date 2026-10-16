package main.java.observer.pattern;

public interface Subject {
    void notificar();
    void remover (Observer observer);
    void adicionar(Observer observer);
}
