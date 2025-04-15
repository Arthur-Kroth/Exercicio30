package Principal;

import model.Aluno; // Importa a classe Aluno que est� na camada Model
import model.Funcionario; // Importa a classe Funcionario que est� na camada Model
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        Aluno objeto = new Aluno();
        
        objeto.setNome("Tiburcio");
        objeto.setIdade(85);
        objeto.setPeso(135.5);
        
        JOptionPane.showMessageDialog(null, "Nome do Aluno: " + objeto.getNome());
        JOptionPane.showMessageDialog(null, "Idade: " + objeto.getIdade());
        JOptionPane.showMessageDialog(null, "Peso: " + objeto.getPeso());
        
        
        
        Funcionario objeto2 = new Funcionario();
        objeto2.setNome("Professora Genoveva");
        objeto2.setSalario(2500.60);
        JOptionPane.showMessageDialog(null, "Nome: " + objeto2.getNome() + "\n" + "Salario: " + objeto2.getSalario());
    }
}