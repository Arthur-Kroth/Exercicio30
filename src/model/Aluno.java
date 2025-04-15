package model;

public class Aluno {
    
    private String nome;
    private int idade;
    private double peso;
    
    public Aluno() {
    }    

    public Aluno(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }


    // Métodos GET e SET
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

    public double getPeso() {
        return peso;
    }

    // Atributos
    public void setPeso(double peso) {
        this.peso = peso;
    }


}