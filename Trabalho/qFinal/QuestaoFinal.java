package Trabalho.qFinal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class QuestaoFinal {
    public static void main(String[] args) {
        
        ArrayList<Participante> lista = new ArrayList<>();
        HashSet<Participante> conjunto = new HashSet<>();

        lista.add(new Participante("Joao", "111111111", "joao@gmail.com"));
        lista.add(new Participante("Isa", "222222222", "isa@gmail.com"));
        lista.add(new Participante("Vitor", "111111111", "vitor@gmail.com"));

        conjunto.add(new Participante("Joao", "111111111", "joao@gmail.com"));
        conjunto.add(new Participante("Isa", "222222222", "isa@gmail.com"));
        conjunto.add(new Participante("Vitor", "111111111", "vitor@gmail.com"));

        System.out.println(lista.size());
        System.out.println(conjunto.size());

        Repositorio<ProjetoF> rep = new Repositorio<>();

        rep.adicionar(new ProjetoF("Pitor", 10, 10, 10, 1990));
        rep.adicionar(new ProjetoF("Automacao de Codido", 9, 9, 9, 2010));
        rep.adicionar(new ProjetoF("Machine Learning", 10, 10, 10, 2025));

        rep.ordenar();
        rep.listar();

        ControleEvento controle = new ControleEvento();

        Trilha t1 = new Trilha("IA", "Valter");
        Trilha t2 = new Trilha("TCC", "Cici");

        controle.cadastrarTrilha("t1", t1);
        controle.cadastrarTrilha("t2", t2);

        t1.inscreverParticipante("222222222");
        t2.inscreverParticipante("222222222");
        t2.inscreverParticipante("111111111");

        Set<String> palestras = new HashSet<>();
        Set<String> workshop = new HashSet<>();
        Set<String> hackthons = new HashSet<>();

        palestras.add("123");
        palestras.add("456");
        palestras.add("891");


        workshop.add("123");
        workshop.add("789");

        hackthons.add("456");
        hackthons.add("123");
        
        Set<String> todos = new HashSet<>(palestras);
        todos.addAll(workshop);
        todos.addAll(hackthons);

        System.out.println(todos);
        
        System.out.println(controle.buscarTrilha("t1"));
        System.out.println(controle.buscarTrilha("t2"));

        controle.listarTrilhasComMaisDe(1);

        Set<String> tres = new HashSet<>(palestras);
        tres.retainAll(workshop);
        tres.retainAll(hackthons);

        System.out.println("quem participou das tres atividades: " + tres);

        System.out.println("quem participou apenas de palestras: " + palestras);

        Set<String> i1 = new HashSet<>(palestras);
        i1.retainAll(workshop);

        Set<String> i2 = new HashSet<>(palestras);
        i2.retainAll(hackthons);

        Set<String> i3 = new HashSet<>(workshop);
        i3.retainAll(hackthons);

        i1.addAll(i2);
        i1.addAll(i3);

        i1.removeAll(tres);

        System.out.println("quem participou de exatamente duas atividades: " + i1);

        Set<String> naoHackthons = new HashSet<>(palestras);

        naoHackthons.addAll(workshop);
        naoHackthons.removeAll(hackthons);

        System.out.println("nao participou de hackthons: " + naoHackthons);

        

        

    }
}    
        