package main.java;

import main.java.negocio.AplicacaoLogistica;

import java.util.Scanner;

public class LogisticaTeste {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o tipo de transporte: ");
            var tipo = scanner.nextLine();

            var logistica = new AplicacaoLogistica();
            var transporte = logistica.alocar(tipo);

            transporte.iniciarTrajeto();
            transporte.finalizarTrajeto();
        }
    }

}
