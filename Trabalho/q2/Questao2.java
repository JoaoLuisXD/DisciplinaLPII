package Trabalho.q2;

import java.util.ArrayList;
import java.util.Collections;

public class Questao2 {
    public static void main(String[] args) {
        
        Projeto p1 = new Projeto("Marciano", 10, 10, 10, 1980);
        Projeto p2 = new Projeto("If", 10, 6, 7, 1990);

        ArrayList<Projeto> lista = new ArrayList<Projeto>();
        lista.add(p1);
        lista.add(p2);
        
        Collections.sort(lista);

        for (Projeto i : lista) {
            System.out.println(i);
        }
    }
}