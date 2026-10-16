package main.java;

import main.java.decorator.*;

import java.util.ArrayList;
import java.util.List;

public class TesteDecorator {



    public static void main(String[] args) {

        Cafe meuCafe =
                new ChocolateDecorator(
                        new LeiteDecorator(
                                new ChantillyDecorator(
                                        new CafeSimples()
                                )
                        )
                );

        meuCafe.report();

        System.out.println(
                "Bebida: " + meuCafe.getDescricao() +
                        " R$ " + meuCafe.getPreco()
        );
    }
}
