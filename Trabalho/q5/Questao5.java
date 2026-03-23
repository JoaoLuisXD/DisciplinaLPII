package Trabalho.q5;

public class Questao5 {
    public static void main(String[] args) {
        ControleAcademico ca = new ControleAcademico();

        Disciplina d1 = new Disciplina("Banco de Dados I", "Marciano");
        Disciplina d2 = new Disciplina("Engenharia de Software", "Andressa");

        ca.cadastrarDisciplina("BD1", d1);
        ca.cadastrarDisciplina("ES", d2);
        
        d1.matricular(1);
        d1.matricular(2);

        d2.matricular(2);
        d2.matricular(3);
        d2.matricular(4);

        System.out.println(ca.buscarDisciplina("BD1"));

        ca.listarDisciplinaComMaisDe(2);

    }
}
