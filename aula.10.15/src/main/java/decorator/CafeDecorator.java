package main.java.decorator;
public abstract class CafeDecorator implements Cafe {

    protected Cafe cafeDecorado;

    public CafeDecorator(Cafe cafe) {
        this.cafeDecorado = cafe;
    }

    public String getDescricao() {
        return cafeDecorado.getDescricao();
    }

    public Double getPreco() {
        return cafeDecorado.getPreco();
    }

    @Override
    public void report() {
        System.out.println(
                cafeDecorado.getClass().getSimpleName() +
                        " " +
                        cafeDecorado.getPreco());
    }

}

