package main.java;

import main.java.pattern.Documento;
import main.java.pattern.Endereco;
import main.java.pattern.Pessoa;
import main.java.pattern.PessoaDeep;

public class TestePrototypePattern {

    public static void main(String[] args) throws CloneNotSupportedException {
        var original =  new Documento("A", "A", 2);
        var copia = original.clone();
        copia.setConteudo(5);

        System.out.println(original.getConteudo());
        System.out.println(copia.getConteudo());

        /***/
        var endereco = new Endereco();
        endereco.rua = "Rua São Bento";

        var pessoa = new Pessoa();
        var pessoaDeep = new PessoaDeep();
        pessoa.endereco = endereco;
        pessoaDeep.endereco = endereco;

        var copiaPessoa = pessoa.clone();
        var copiaPessoaDeep = pessoaDeep.clone();

        endereco.rua = "Rua xxx";

        System.out.println(pessoa.endereco.rua);
        System.out.println(copiaPessoa.endereco.rua);
        System.out.println(copiaPessoaDeep.endereco.rua);

    }

}
