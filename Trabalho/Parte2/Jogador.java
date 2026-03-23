package Trabalho.Parte2;

public class Jogador implements Comparable<Jogador>{
    private String nome;
    private Integer pontuacao;
    
    public Jogador(String nome, Integer pontuacao){
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\npontuação: " + pontuacao;
    }

    @Override
    public int compareTo(Jogador o) {
        if (Integer.compare(this.pontuacao, o.pontuacao) != 0) {
            return Integer.compare(o.pontuacao, this.pontuacao);
        }
        return this.nome.compareTo(o.nome);
    }
}
