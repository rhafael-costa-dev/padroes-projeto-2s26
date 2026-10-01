package main.java.modelo.impl;

import main.java.modelo.Button;

public class DarkButton implements Button {

    @Override
    public void render() {
        System.out.println("Botão Escuro renderizado");
    }

}
