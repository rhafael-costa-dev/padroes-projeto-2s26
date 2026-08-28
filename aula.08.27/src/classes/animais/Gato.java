package classes.animais;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String name) {
        super(name);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getName() + " miando...");
    }

}
