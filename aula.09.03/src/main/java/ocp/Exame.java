package main.java.ocp;

public class Exame {

    private String nome;
    private String tipo;
    private Integer number;

    public Exame(String nome, String tipo, Integer number) {
        this.nome = nome;
        this.tipo = tipo;
        this.number = number;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
