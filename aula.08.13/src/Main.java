import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        var s = Status.ATIVO;
        var d1 = new Disciplina(1L, "PP", s);
        var d2 = new Disciplina(2L, "Algoritmos", s);
        var d3 = new Disciplina(3L, "Redes", s);

        var p1 = Professor.create("Jose da Sila");
        var p2 = Professor.create("Ana Carla");

        p1.adicionaDisciplina(d1);
        p1.adicionaDisciplina(d3);
        p2.adicionaDisciplina(d2);

        imprimir(p1);
        imprimir(p2);

        imprimir(p1);
        imprimir(p2);
    }

    public static void imprimir(Professor professor) {
        System.out.println("Diciplinas do Professor: " + professor.getNome());
        for (Disciplina d : professor.getDisciplinas()) {
            System.out.println(d.getNome());
        }
    }

}

