package main.java.pattern;

public class Pessoa implements Cloneable {

    public String nome;
    public Endereco endereco; // Objeto compartilhado!

    @Override
    public Pessoa clone() throws CloneNotSupportedException {
        return (Pessoa) super.clone(); // Apenas shallow copy
    }

}
