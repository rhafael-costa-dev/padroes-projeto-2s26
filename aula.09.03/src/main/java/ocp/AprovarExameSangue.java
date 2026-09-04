package main.java.ocp;

public class AprovarExameSangue implements AprovarExame {
    @Override
    public void aprovarSolicitacaoExame(Exame exame) {
        if (this.aprovarCondicoesExame(exame)) {
            System.out.println("Exame SANGUE aprovado!");
        } else {
            System.out.println("Exame SANGUE reprovado!");
        }
    }

    @Override
    public boolean aprovarCondicoesExame(Exame exame) {
        return exame.getNumber() < 100;
    }
}
