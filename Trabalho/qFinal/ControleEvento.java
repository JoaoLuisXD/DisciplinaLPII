package Trabalho.qFinal;

import java.util.HashMap;
import java.util.Map;

public class ControleEvento {
    Map<String, Trilha> controle = new HashMap<>();

    public void cadastrarTrilha(String codigo, Trilha trilha){
        controle.put(codigo, trilha);
    }

    public Trilha buscarTrilha(String codigo){
        return controle.get(codigo);
    }

    public void listarTrilhasComMaisDe(int quantidadeParticipantes){
        for (Map.Entry<String, Trilha> i: controle.entrySet()) {
            if(i.getValue().totalParticipantes() > quantidadeParticipantes){
                System.out.println(i.getValue().toString());
            }
        }
    }
}
