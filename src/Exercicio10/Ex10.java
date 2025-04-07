package Exercicio10;


//Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.


import javax.swing.*;

public class Ex10 {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));

        System.out.println("A média é " + (nota1 + nota2 + nota3) / 3);
    }
}
