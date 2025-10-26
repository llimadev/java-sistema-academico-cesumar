package br.com.unicesumar.app;

import br.com.unicesumar.app.model.Aluno;
import br.com.unicesumar.app.model.Professor;

public class Main {
    public static void main(String[] args) {

        //Questão 1 – Classe e Objeto
        Aluno aluno = new Aluno();
        aluno.setNome("Leonel de Lima Barbosa");
        aluno.setMatricula("24059760-5");

        System.out.println("Questão 1:\n");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());

        //Questão 2 – Encapsulamento
        aluno.setNome("Leonel L. Barbosa");
        System.out.println("\nQuestão 2:\n");
        System.out.println("Nome alterado: " + aluno.getNome());

        //Questão 3 – Herança
        aluno.setNome("Leonel de Lima Barbosa");
        aluno.setCurso("Analise e Desenvolvimento de Sistemas");
        aluno.setMatricula("24059760-5");

        Professor professor = new Professor();
        professor.setNome("Edmar Senne");
        professor.setDisciplina("Programação Orientada a Objetos");

        System.out.println("\nQuestão 3:\n");
        System.out.println("Dados do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Matrícula: " + aluno.getMatricula());

        System.out.println("\nDados do Professor:");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Disciplina: " + professor.getDisciplina());

        //Questão 4 – Polimorfismo
        System.out.println("\nQuestão 4:\n");
        aluno.apresentar();
        professor.apresentar();

        //Questão 5 – Interface
        System.out.println("\nQuestão 5:\n");
        aluno.avaliarDesempenho();
    }
}