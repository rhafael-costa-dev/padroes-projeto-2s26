package main.java.decorator;
public class LeiteDecorator extends CafeDecorator {

    private Double valor = 1.50;
    public LeiteDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao() + ", Leite";
    }

    @Override
    public void report() {
        cafeDecorado.report();
        System.out.println(
                LeiteDecorator.class.getSimpleName() +
                        " " +
                        valor);
    }

    @Override
    public Double getPreco() {
        return cafeDecorado.getPreco() + valor;
    }
}
