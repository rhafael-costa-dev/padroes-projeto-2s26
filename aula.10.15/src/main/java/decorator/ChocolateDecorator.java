package main.java.decorator;

public class ChocolateDecorator extends CafeDecorator {

    private Double valor = 2.00;
    public ChocolateDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao() + ", Chocolate";
    }

    @Override
    public void report() {
        cafeDecorado.report();
        System.out.println(
                ChocolateDecorator.class.getSimpleName() +
                        " " +
                       valor);
    }

    @Override
    public Double getPreco() {
        return cafeDecorado.getPreco() + valor;
    }
}
