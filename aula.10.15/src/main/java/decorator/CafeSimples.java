package main.java.decorator;

public class CafeSimples implements Cafe {

    @Override
    public Double getPreco() {
        return 4.00;
    }

    @Override
    public String getDescricao() {
        return "Café Simples";
    }

    @Override
    public void report() {
        System.out.println(
                CafeSimples.class.getSimpleName() +
                        " " +
                        getPreco());
    }

}
