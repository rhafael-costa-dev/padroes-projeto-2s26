package main.java;

import main.java.modelo.Button;
import main.java.modelo.Checkbox;
import main.java.modelo.impl.DarkButton;
import main.java.modelo.impl.DarkCheckbox;
import main.java.modelo.impl.LightButton;
import main.java.modelo.impl.LightCheckbox;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        String tema = "";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Temas: Dark ou Lihgt ");
            System.out.println("Escolha uma Tema: ");
            tema = scanner.nextLine();
        }

        Button button;
        Checkbox checkbox;
        if ("dark".equals(tema)) {
            button = new DarkButton();
            checkbox = new DarkCheckbox();
        } else {
            button = new LightButton();
            checkbox = new LightCheckbox();
        }


    }

}
