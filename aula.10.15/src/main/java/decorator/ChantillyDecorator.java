package main.java.decorator;

public class ChantillyDecorator extends CafeDecorator {

    private Double valor = 1.00;
    public ChantillyDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public void report() {
        cafeDecorado.report();
        System.out.println(
                ChantillyDecorator.class.getSimpleName() +
                        " " +
                        valor);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Chantilly";
    }

    @Override
    public Double getPreco() {
        return super.getPreco() + valor;
    }
}
