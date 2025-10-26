package br.com.unicesumar.app.model;

public class Aluno extends Pessoa implements Avaliado {
    private String nome;
    private String matricula;
    private String curso;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + getNome() + " e curso " + getCurso() + ".");
    }

    @Override
    public void avaliarDesempenho() {
        System.out.println("O aluno " + getNome() + " obteve um desempenho excelente.");
    }
}
