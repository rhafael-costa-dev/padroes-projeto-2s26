package main.java;

import main.java.ocp.*;

public class TesteSolidOCP {

    public static void main(String[] args) {
        var exame1 = new Exame("João", "SANGUE", 50);
        var exame2 = new Exame("João", "SANGUE", 120);
        var exame3 = new Exame("João", "RAIO-X", 1);
        var exame4 = new Exame("João", "RAIO-X", 50);

        var aprovarExameSangue = new AprovarExameSangue();
        var aprovarExameRaioX =  new AprovarExameRaioX();
        var aprovarExame = new AprovarExameEcografia();

        validar(aprovarExameSangue, exame1);
        validar(aprovarExameSangue, exame2);
        validar(aprovarExameRaioX, exame3);
        validar(aprovarExameRaioX, exame4);
        validar(aprovarExame, exame1);


    }

    private static void validar(AprovarExame aprovarExame, Exame exame) {
        aprovarExame.aprovarCondicoesExame(exame);
    }

}
