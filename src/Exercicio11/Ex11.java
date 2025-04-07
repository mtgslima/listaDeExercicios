package Exercicio11;


//Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
// se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.


import javax.swing.*;

public class Ex11 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));

        System.out.println("A média das notas de " + nome + " é " + (nota1 + nota2 + nota3) / 3);
    }
}
