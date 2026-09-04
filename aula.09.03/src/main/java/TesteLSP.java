package main.java;

import main.java.lsp.Estudante;
import main.java.lsp.EstudanteDeGraduacao;
import main.java.lsp.EstudanteDePosGraduacao;

public class TesteLSP {

    public static void main(String[] args) {
        var estudante = new EstudanteDeGraduacao("Jose");
        var estudantePos =  new EstudanteDePosGraduacao("Joao");

        estudante.estudar();
        estudante.entregarTCC();

        estudantePos.estudar();
    }

}
