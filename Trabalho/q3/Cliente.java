package Trabalho.q3;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public Cliente(String nome, String cpf, String email, String telefone) throws NullPointerException, IllegalArgumentException{
        
        if (cpf == null) {
            throw new NullPointerException("Cpf está nulo");
        }
        if (cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("Cpf está vazio");
        }

        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public boolean equals(Object o) {
        Cliente c = (Cliente) o;
        return this.cpf.equals(c.cpf);
    }

    @Override
    public int hashCode() {
        return cpf.hashCode();
    }
}
