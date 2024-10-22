package com.mycompany.proopessoanew;



import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
    private String curso;

    // Constante padrão para curso
    public static final String CURSO_DEFAULT = "Sistema de Informação";

    // Construtor sem parâmetros
    public Aluno() {
        this.curso = CURSO_DEFAULT; // Valor padrão
    }

    // Construtor com parâmetros
    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    // Getters e Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void lerDados() {
        super.lerDados();
        this.curso = CURSO_DEFAULT; // Preenche com o padrão
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        JOptionPane.showMessageDialog(null, "Curso: " + getCurso());
    }

    @Override
    public String getNomeFormatado() {
        return getNome().toUpperCase();
    }
}
