package main.java.pattern;

public class PessoaDeep implements Cloneable {

    public String nome;
    public Endereco endereco; // Objeto compartilhado!

    @Override
    public PessoaDeep clone() throws CloneNotSupportedException {
        var copia = (PessoaDeep) super.clone();
        copia.endereco = (Endereco) this.endereco.clone();
        return copia;
    }

}
