package Treino;

import java.util.HashMap;
import java.util.Map;

public class ControleBiblioteca {
    Map<String, Livro> livros = new HashMap<>();
    
    public void cadastrarLivro(String codigo, Livro livro){
        livros.put(codigo, livro);
    }

    public Livro buscarLivro(String codigo){
        return livros.get(codigo);
    }

    public void listarLivrosComMaisDe(int quantidade){
        for (Map.Entry<String, Livro> i: livros.entrySet()) {
            if (i.getValue().totalEmprestimos() > quantidade) {
                System.out.println(i.getValue().toString());
            }
        }
    }
}
