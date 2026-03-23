package Trabalho.qFinal;

public class Participante {
    private String nome;
    private String cpf;
    private String email;

    public Participante(String nome, String cpf, String email) throws NullPointerException, IllegalArgumentException{
        if (cpf == null) {
            throw new NullPointerException("O cpf não pode ser nulo.");
        }
        if (cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("O cpf não pode estar vazio");
        }

        this.nome = nome;
        this.cpf = cpf; 
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        Participante p = (Participante) o;
        return this.cpf.equals(p.cpf);
    }

    @Override
    public int hashCode() {
        return cpf.hashCode();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
