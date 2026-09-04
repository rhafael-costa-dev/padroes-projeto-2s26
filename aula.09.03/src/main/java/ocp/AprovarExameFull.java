package main.java.ocp;

public class AprovarExameFull {

    public void aprovarSolicitacaoExame(Exame exame) {

        if (exame.getTipo().equals("SANGUE")) {
            if (this.aprovarCondicoesExameSangue(exame)) {
                System.out.println("Exame SANGUE aprovado!");
            } else {
                System.out.println("Exame SANGUE reprovado!");
            }
        } else if (exame.getTipo().equals("RAIO-X")) {

            if (this.aprovarCondicoesExameRaioX(exame)) {
                System.out.println("Exame RAIO_X aprovado!");
            } else {
                System.out.println("Exame RAIO_X reprovado!");
            }
        }
    }

    private boolean aprovarCondicoesExameSangue(Exame exame) {
        return exame.getNumber() < 100;
    }

    private boolean aprovarCondicoesExameRaioX(Exame exame) {
        return exame.getNumber() < 10;
    }

}
