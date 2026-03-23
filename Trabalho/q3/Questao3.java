package Trabalho.q3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Questao3 {
    public static void main(String[] args) {
        Set<Cliente> clientes = new HashSet<>();
        
        Cliente c1 = new Cliente("Joao", "123", "joaozin@gmail.com", "999999");
        Cliente c2 = new Cliente("Isabela", "123", "isabela@gmail.com", "987654");
        
        clientes.add(c1);
        clientes.add(c2);

        // HashSet não permite duplicidade. Como equals e hashCode usam o CPF,
        // c1 e c2 são considerados iguais, então apenas um é armazenado.
        System.out.println("hashset size: " + clientes.size());

        ArrayList<Cliente> listaCliente = new ArrayList<>();

        listaCliente.add(c1);
        listaCliente.add(c2);

        // ArrayList permite elementos duplicados, pois ele não verifica
        // equals ou hashCode ao adicionar elementos.
        System.out.println("array size: " + listaCliente.size());

        System.out.println(c1.equals(c2));

    }
}
