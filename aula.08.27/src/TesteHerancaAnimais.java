import classes.animais.Animal;
import classes.animais.Cachorro;
import classes.animais.Gato;

import java.util.List;

public class TesteHerancaAnimais {

    public static void main(String[] args) {
        List<Animal> animals = List.of(
                new Animal("Urso"),
                new Gato("Bichano"),
                new Cachorro("Dog")
        );

        animals.forEach(animal -> imprimir(animal));
    }

    private static void imprimir(Animal animal) {
        animal.emitirSom();
    }

}