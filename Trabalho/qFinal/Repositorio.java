package Trabalho.qFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repositorio<T extends Comparable<T>> {
    List<T> lista = new ArrayList<>();

    public void adicionar(T elemento){
        lista.add(elemento);
    }

    public void remover(T elemento){
        lista.remove(elemento);
    }

    public T buscar(Integer indice){
        for (int i = 0; i < lista.size(); i++) {
            if (i == indice) {
                return lista.get(i);
            }
        }
        return null;
    }

    public void listar(){
        for (T t : lista) {
            System.out.println(t);
        }
    }

    public int quantidade(){
        return lista.size();
    }

    public void ordenar(){
        Collections.sort(lista);   
    }
}
