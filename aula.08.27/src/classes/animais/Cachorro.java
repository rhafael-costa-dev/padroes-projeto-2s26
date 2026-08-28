package classes.animais;

public class Cachorro extends Animal {

    public Cachorro() {
    }

    public Cachorro(String name) {
        super(name);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getName() + " latindo....");
    }

}
