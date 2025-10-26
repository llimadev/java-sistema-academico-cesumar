package br.com.unicesumar.app.model;

public class Pessoa {
    private String nome;
    private String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ".");
    }
}
