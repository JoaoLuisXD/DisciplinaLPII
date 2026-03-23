package Trabalho.Parte2;

public class Main {
    public static void main(String[] args) {
        Ranking<Jogador> ranking = new Ranking<>();

        ranking.adicionar(new Jogador("Joao", 12));
        ranking.adicionar(new Jogador("Donato", 12));
        ranking.adicionar(new Jogador("Kessya", 12));
        ranking.adicionar(new Jogador("Isabela", 12));
        ranking.adicionar(new Jogador("Kessya", 12));

        ranking.mostrarResultado();
    }
}
