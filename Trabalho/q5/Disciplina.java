package Trabalho.q5;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String professor;
    private List<Integer> alunos = new ArrayList<>();

    public Disciplina(String nome, String professor){
        this.nome = nome;
        this.professor = professor;
    }

    public void matricular(Integer matricula){
        alunos.add(matricula);
    }

    public void remover(Integer matricula){
        alunos.remove(matricula);
    }

    public Integer total(){
        return alunos.size();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nProfessor: " + professor + "\nTotal de alunos: " + total();
    }
}
