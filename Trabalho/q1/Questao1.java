package Trabalho.q1;

public class Questao1 {
    public static void main(String[] args) {

        Repositorio r = new Repositorio();
        r.add(new Produto(1, "arroz", 5.60));
        
        r.add(new Cliente("123", "Isabela"));
        
        r.listar();
    }
}
