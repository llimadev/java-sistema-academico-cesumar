package br.com.unicesumar.app.model;

public class Professor extends Pessoa {
    private String nome;
    private String disciplina;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + getNome() + " e leciono " + disciplina + ".");
    }

}
