package Treino;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    List<String> lista = new ArrayList<>();

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public void registrarEmprestimo(String cpf){
        lista.add(cpf);
    }

    public void devolverLivro(String cpf){
        lista.remove(cpf);
    }

    public int totalEmprestimos(){
        return lista.size();
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + "\nautor: " + autor  + "\ntotal emprestimo: " + totalEmprestimos();
    }

}
