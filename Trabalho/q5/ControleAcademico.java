package Trabalho.q5;

import java.util.HashMap;
import java.util.Map;

public class ControleAcademico {
    private Map<String,Disciplina> disciplinas = new HashMap<>();

    public void cadastrarDisciplina(String codigo, Disciplina disciplina){
        disciplinas.put(codigo, disciplina);
    }

    public Disciplina buscarDisciplina(String codigo){
        return disciplinas.get(codigo);
    }

    public void listarDisciplinaComMaisDe(int quantidade){
        for (Map.Entry<String, Disciplina> i: disciplinas.entrySet()) {
            if (i.getValue().total() > quantidade) {
                System.out.println(i.getValue().toString());    
            }
        }
    }
}
