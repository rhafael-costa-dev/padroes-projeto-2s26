package main.java;

import main.java.without.patterm.Cliente;

public class TesteSemPrototype {

    public static void main(String[] args) {
        var cliente = new Cliente("Ana", "ana@email", "Curitiba");

        var cliente2 = cliente;
        cliente2.setCidade("TT");

        var cliente3 =  new Cliente();
        cliente3.setNome(cliente.getNome());
        cliente3.setEmail(cliente.getEmail());
        cliente3.setCidade("cliente.getCidade()");

        System.out.println(cliente.getCidade());
        System.out.println(cliente2.getCidade());
        System.out.println(cliente3.getCidade());

        System.out.println("Teste 1 -> " + (cliente == cliente2));
        System.out.println("Teste 2 -> " + (cliente.equals(cliente2)));

        System.out.println("Teste 3 -> " + (cliente == cliente3));
        System.out.println("Teste 4 -> " + (cliente.equals(cliente3)));

        System.out.println("Teste 5 -> " + (cliente3 == cliente2));
        System.out.println("Teste 6 -> " + (cliente3.equals(cliente2)));

    }

}
