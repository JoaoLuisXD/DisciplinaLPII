package Trabalho.q1;

public class Produto {
    private Integer codigo;
    private String nome;
    private Double preco;

    public Produto(Integer codigo, String nome, Double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "codigo: " + codigo + "\nnome: " + nome + "\npreco: " + preco;
    }
}
