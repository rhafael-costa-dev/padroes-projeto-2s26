package main.java.pattern;

public class Endereco implements Cloneable {
    public String rua;

    @Override
    public Endereco clone() throws CloneNotSupportedException {
        return (Endereco) super.clone();
    }
}
