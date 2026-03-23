package Treino;

public class Main {
    public static void main(String[] args) {
        ControleBiblioteca controle = new ControleBiblioteca();

        Livro l1 = new Livro("Pequeno principe", "Adriana");
        Livro l2 = new Livro("Java", "Marciano");
        Livro l3 = new Livro("Amor", "Isabela");

        controle.cadastrarLivro("l1", l1);
        controle.cadastrarLivro("l2", l2);
        controle.cadastrarLivro("l3", l3);

        l1.registrarEmprestimo("1");
        l1.registrarEmprestimo("2");
        l2.registrarEmprestimo("3");
        l2.registrarEmprestimo("4");
        l2.registrarEmprestimo("5");
        l3.registrarEmprestimo("6");
        l3.registrarEmprestimo("7");
        l3.registrarEmprestimo("8");
        l1.registrarEmprestimo("9");
        l2.registrarEmprestimo("10");
        l3.registrarEmprestimo("11");
        l3.registrarEmprestimo("12");

        System.out.println(controle.buscarLivro("l1"));
        System.out.println(controle.buscarLivro("l2"));
        System.out.println(controle.buscarLivro("l3"));

        System.out.println(l1.totalEmprestimos());
        System.out.println(l2.totalEmprestimos());
        System.out.println(l3.totalEmprestimos());

        controle.listarLivrosComMaisDe(4);

    }
}
