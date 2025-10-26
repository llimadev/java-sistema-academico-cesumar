package br.com.unicesumar.app;

import br.com.unicesumar.app.model.Aluno;
import br.com.unicesumar.app.model.Professor;

public class Main {
    public static void main(String[] args) {

        //Questão 1 – Classe e Objeto
        //Crie uma classe Aluno com os atributos nome e matrícula.
        //No métod0 main, crie um objeto Aluno com seus próprios dados e exiba no console:
        //Nome: seu nome
        //Matrícula: número de matrícula fictício
        Aluno aluno = new Aluno();
        aluno.setNome("Leonel de Lima Barbosa");
        aluno.setMatricula("24059760-5");

        System.out.println("Questão 1:\n");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());

        //Questão 2 – Encapsulamento
        //Modifique a classe Aluno para que os atributos sejam privados.
        //Crie getters e setters para acessar e alterar os dados.
        //No main, altere, por exemplo, seu nome usando o setter e exiba novamente usando o getter.
        aluno.setNome("Leonel L. Barbosa");
        System.out.println("\nQuestão 2:\n");
        System.out.println("Nome alterado: " + aluno.getNome());

        //Questão 3 – Herança
        //Crie uma classe Pessoa com o atributo nome.
        //Faça Aluno herdar de Pessoa e adicione o atributo curso.
        //Crie a classe Professor com o atributo disciplina.
        //No main, crie:
        //Um objeto Aluno com seus dados
        //Um objeto Professor com dados fictícios
        //Exiba todos os atributos de ambos.
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
        //Na classe Pessoa, crie o métod0 apresentar().
        //Sobrescreva esse métod0 em Aluno e Professor, retornando apresentações personalizadas.
        //No main, chame apresentar() para seu objeto Aluno e para o objeto Professor, demonstrando polimorfismo.
        System.out.println("\nQuestão 4:\n");
        aluno.apresentar();
        professor.apresentar();

        //Questão 5 – Interface
        //Crie uma interface Avaliado com o métod0 avaliarDesempenho().
        //Faça a classe Aluno implementar a interface, retornando uma mensagem personalizada, por exemplo: "Aluno [seu nome] obteve ótimo desempenho!"
        //No main, invoque esse métod0 para o seu objeto Aluno.
        System.out.println("\nQuestão 5:\n");
        aluno.avaliarDesempenho();
    }
}