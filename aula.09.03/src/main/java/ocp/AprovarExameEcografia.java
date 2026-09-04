package main.java.ocp;

public class AprovarExameEcografia implements AprovarExame {
    @Override
    public void aprovarSolicitacaoExame(Exame exame) {
        if (this.aprovarCondicoesExame(exame)) {
            System.out.println("Exame Ecografia aprovado!");
        } else {
            System.out.println("Exame Ecografia reprovado!");
        }
    }

    @Override
    public boolean aprovarCondicoesExame(Exame exame) {
        return true;
    }
}
