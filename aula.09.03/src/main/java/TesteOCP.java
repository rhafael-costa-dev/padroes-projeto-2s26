package main.java;

import main.java.ocp.AprovarExameFull;
import main.java.ocp.Exame;

public class TesteOCP {

    public static void main(String[] args) {
        var exame1 = new Exame("João", "SANGUE", 50);
        var exame2 = new Exame("João", "SANGUE", 120);
        var exame3 = new Exame("João", "RAIO-X", 1);
        var exame4 = new Exame("João", "RAIO-X", 50);
        var aprovarExame = new AprovarExameFull();

        aprovarExame.aprovarSolicitacaoExame(exame1);
        aprovarExame.aprovarSolicitacaoExame(exame2);
        aprovarExame.aprovarSolicitacaoExame(exame3);
        aprovarExame.aprovarSolicitacaoExame(exame4);
    }

}
