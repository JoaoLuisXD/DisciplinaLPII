package Trabalho.qFinal;

public class ProjetoF implements Comparable<ProjetoF>{
    private String titulo;
    private double notaInovacao;
    private double notaImpacto;
    private double notaTecnica;
    private int anoSubmissao;

    public ProjetoF(String titulo, double notaInovacao, double notaImpacto, double notaTecnica, int anoSubmissao) throws IllegalArgumentException{
        
        if(notaInovacao < 0 || notaInovacao > 10){
            throw new IllegalArgumentException("A nota não pode ser menor que 0, e a nota não pode ser maior que 10");
        }
        if(notaImpacto < 0 || notaImpacto > 10){
            throw new IllegalArgumentException("A nota não pode ser menor que 0, e a nota não pode ser maior que 10");
        }
        if(notaTecnica < 0 || notaTecnica > 10){
            throw new IllegalArgumentException("A nota não pode ser menor que 0, e a nota não pode ser maior que 10");
        }
        
        this.titulo = titulo;
        this.notaInovacao = notaInovacao;
        this.notaImpacto = notaImpacto;
        this.notaTecnica = notaTecnica;
        this.anoSubmissao = anoSubmissao;
    }

    public double somaNotas(){
        return notaImpacto + notaInovacao + notaTecnica;
    }

    @Override
    public int compareTo(ProjetoF o) {
        if (Double.compare(this.somaNotas(), o.somaNotas()) != 0) {
            return Double.compare(o.somaNotas(), this.somaNotas());
        }
        if (Double.compare(this.notaImpacto, o.notaImpacto) != 0) {
            return Double.compare(o.notaImpacto, this.notaImpacto);
        }
        if (Integer.compare(this.anoSubmissao, o.anoSubmissao) != 0) {
            return Integer.compare(o.anoSubmissao, this.anoSubmissao);
        }   
        return this.titulo.compareTo(o.titulo);
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + "\nnota inovação: " + notaInovacao + "\nnota impacto: " + notaImpacto + "\nnota tecnica: " + notaTecnica + "\nano submissão: " + anoSubmissao; 
    }
}
