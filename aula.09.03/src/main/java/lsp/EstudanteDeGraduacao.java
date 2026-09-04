package main.java.lsp;

public class EstudanteDeGraduacao extends Estudante {

    public EstudanteDeGraduacao(String nome) {
        super(nome);
    }

    @Override
    public void estudar() {
        System.out.println(nome + " está estudando e pesquisando.");
    }

    public void entregarTCC() {
        System.out.println(nome  + " está entregando o TCC...");
    }

}