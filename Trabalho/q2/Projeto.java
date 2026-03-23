package Trabalho.q2;

public class Projeto implements Comparable<Projeto>{
    private String titulo;
    private double notaOriginalidade;
    private double notaImpacto;
    private double notaViabilidade;
    private int anoSubmissao;

    public Projeto(String titulo, double notaOriginalidade, double notaImpacto, double notaViabilidade, int anoSubmissao) throws IllegalArgumentException{
        this.titulo = titulo;
        this.notaOriginalidade = notaOriginalidade;
        if(notaOriginalidade < 0 || notaOriginalidade > 10){
            throw new IllegalArgumentException("A nota não pode ser menor que 0, e a nota não pode ser maior que 10");
        }
        this.notaImpacto = notaImpacto;
        if(notaImpacto < 0 || notaImpacto > 10){
            throw new IllegalArgumentException("A nota não pode ser menor que 0, e a nota não pode ser maior que 10");
        }
        this.notaViabilidade = notaViabilidade;
        if(notaViabilidade < 0 || notaViabilidade > 10){
            throw new IllegalArgumentException("A nota não pode ser menor que 0, e a nota não pode ser maior que 10");
        }
        this.anoSubmissao = anoSubmissao;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + "\nnota originalidade: " + notaOriginalidade + "\nnota impacto: " + notaImpacto + "\nnota viabilidade: " + notaViabilidade + "\nano: " + anoSubmissao;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getNotaOriginalidade() {
        return notaOriginalidade;
    }
    public void setNotaOriginalidade(double notaOriginalidade) {
        this.notaOriginalidade = notaOriginalidade;
    }
    public double getNotaImpacto() {
        return notaImpacto;
    }
    public void setNotaImpacto(double notaImpacto) {
        this.notaImpacto = notaImpacto;
    }
    public double getNotaViabilidade() {
        return notaViabilidade;
    }
    public void setNotaViabilidade(double notaViabilidade) {
        this.notaViabilidade = notaViabilidade;
    }
    public int getAnoSubmissao() {
        return anoSubmissao;
    }
    public void setAnoSubmissao(int anoSubmissao) {
        this.anoSubmissao = anoSubmissao;
    }

    public Double total(){
        return notaOriginalidade + notaImpacto + notaViabilidade;
    }

    @Override
    public int compareTo(Projeto o) {

        if (Double.compare(this.total(), o.total()) != 0) {
            return Double.compare(o.total(), this.total());
        }
        if (Double.compare(this.notaImpacto, o.notaImpacto) != 0) {
            return Double.compare(o.notaImpacto, this.notaImpacto);
        }
        if (Integer.compare(this.anoSubmissao, o.anoSubmissao) != 0) {
            return Integer.compare(o.anoSubmissao, this.anoSubmissao);
        }
        return this.titulo.compareTo(o.titulo);
    }
}
    

