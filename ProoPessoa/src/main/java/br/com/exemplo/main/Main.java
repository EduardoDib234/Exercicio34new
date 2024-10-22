package br.com.exemplo.main;

import br.com.exemplo.pessoas.Aluno;
import br.com.exemplo.pessoas.Professor;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.lerDados();
        aluno.imprimirDados();
        JOptionPane.showMessageDialog(null, "Nome formatado: " + aluno.getNomeFormatado());

        Professor professor = new Professor();
        professor.lerDados();
        professor.imprimirDados();
        JOptionPane.showMessageDialog(null, "Nome formatado: " + professor.getNomeFormatado());
    }
}

