package com.mycompany.proopessoanew;



import <any?>;
import com.mycompany.proopessoanew.Pessoa;
import javax.swing.JOptionPane;

public class Professor extends Pessoa {
    private double salario;
    private String titulo;

    
    public static final String TITULO_DEFAULT = "Doutor";

   
    /*public*/ Professor() {
        this.titulo = TITULO_DEFAULT; // Valor padrão
    }

    
    public Professor(String nome, int idade, double salario, String titulo) {
        super(nome, idade);
        this.salario = salario;
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void lerDados() {
        super.lerDados();
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));
        this.titulo = TITULO_DEFAULT; // Preenche com o padrão
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        JOptionPane.showMessageDialog(null, "Salário: " + getSalario() + "\nTítulo: " + getTitulo());
    }

    /**
     *
     * @return
     */
    @Override
    public String getNomeFormatado() {
        return getTitulo() + " " + getNome();
    }

    @Override
    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
