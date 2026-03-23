package Trabalho.qFinal;

import java.util.ArrayList;
import java.util.List;

public class Trilha {
    private String nome;
    private String palestrante;
    List<String> participantes = new ArrayList<>();

    public Trilha(String nome, String palestrante){
        this.nome = nome;
        this.palestrante = palestrante;
    }

    public void inscreverParticipante(String cpf){
        participantes.add(cpf);
    }

    public void removerParticipante(String cpf){
        participantes.remove(cpf);
    }

    public int totalParticipantes(){
        return participantes.size();
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\npalestrante: " + palestrante + "\ntotal de participantes: " + totalParticipantes();
    }
}
