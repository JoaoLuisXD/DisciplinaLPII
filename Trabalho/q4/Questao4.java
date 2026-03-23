package Trabalho.q4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Questao4 {
    public static void main(String[] args) {
        Set<Integer> filmes = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> series = new HashSet<>(Arrays.asList(3,4,5));
        Set<Integer> doc = new HashSet<>(Arrays.asList(1,3,6));

        Set<Integer> total = new HashSet<>(filmes);
        total.addAll(series);
        total.addAll(doc);

        //total de usuarios distintos considerando as tres categorias
        System.out.println("total: " + total.size());

        for (Integer i : total) {
            System.out.println(i);            
        }

        //os usuarios que consumiram as tres categorias simultaneamente
        Set<Integer> tres = new HashSet<>(filmes);
        tres.retainAll(series);
        tres.retainAll(doc);

        System.out.println("Nos 3, em comum temos: " + tres.size());

        //os usuarios que consumiram apenas filmes
        Set<Integer> apenasFilme = new HashSet<>(filmes);

        apenasFilme.removeAll(series);
        apenasFilme.removeAll(doc);

        System.out.println("Apenas filmes: " + apenasFilme.size());

        //os usuarios que consumiram exatamente duas categorias

        Set<Integer> inter1 = new HashSet<>(filmes);
        inter1.retainAll(series);

        Set<Integer> inter2 = new HashSet<>(filmes);
        inter2.retainAll(doc);

        inter1.addAll(inter2);

        Set<Integer> inter3 = new HashSet<>(series);
        inter3.retainAll(doc);

        inter1.addAll(inter3);

        inter1.removeAll(tres);

        System.out.println("Exatamente 2 categorias: " + inter1.size());
        


    }
}


