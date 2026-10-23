package main.java.pattern;

public class Documento implements Cloneable {

    private String autor;
    private String titulo;
    private int conteudo;

    public Documento(String autor, String titulo, int conteudo) {
        this.autor = autor;
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public Documento clone() {
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clonagem não suportada");
        }
    }

    // Getters and Setters

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }
}
