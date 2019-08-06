package lista;

import java.util.Arrays;
import java.util.List;

public class TesteLista {
    public static void main(String[] args) {
    List<Livro> livros = Arrays.asList(new Livro("Teste1", 2.90), new Livro("Teste2",3.10), new Livro("Teste3",3.10));
    //retorna lista
    livros.forEach(System.out::println);

    //retorna lista com filtro valor > 2.0
    livros.stream().filter(c-> c.getValor()>2.0).forEach(System.out::println);

    //retorna soma dos valores da lista
    System.out.println(livros.stream().mapToDouble(c-> c.getValor()).sum());

    //retorna soma dos valores da lista com filtro de valor > 3.0
    System.out.println(livros.stream().filter(c->c.getValor()>3.0).mapToDouble(c->c.getValor()).sum());

    //retorna o valor máximo da lista
    System.out.println(livros.stream().mapToDouble(c-> c.getValor()).max());

    //retorna o valor mínimo da lista
    System.out.println(livros.stream().mapToDouble(c-> c.getValor()).min());

    //retorna a média dos valores da lista
    System.out.println(livros.stream().mapToDouble(c->c.getValor()).average());
    }

}

class Livro{
    private String nome;
    private double valor;

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }

    public Livro(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}