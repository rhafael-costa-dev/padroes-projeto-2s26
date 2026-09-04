package main.java.ocp;

public class AprovarExameRaioX implements AprovarExame {
    @Override
    public void aprovarSolicitacaoExame(Exame exame) {
        if (this.aprovarCondicoesExame(exame)) {
            System.out.println("Exame RAIO_X aprovado!");
        } else {
            System.out.println("Exame RAIO_X reprovado!");
        }
    }

    @Override
    public boolean aprovarCondicoesExame(Exame exame) {
        return exame.getNumber() < 10;
    }
}
