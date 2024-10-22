package com.mycompany.proopessoanew;



import javax.swing.JOptionPane;

public abstract class Pessoa {
    private String nome;
    private int idade;

    // Construtor sem parâmetros
    public Pessoa() {
    }

    // Construtor com parâmetros
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos de leitura e impressão
    public void lerDados() {
        this.nome = JOptionPane.showInputDialog("Digite o nome:");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
    }

    public void imprimirDados() {
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\nIdade: " + getIdade());
    }

    // Método abstrato
    public abstract String getNomeFormatado();
}
