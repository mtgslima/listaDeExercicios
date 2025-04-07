package Exercicio6;


//Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.


import javax.swing.*;

public class Ex6 {
    public static void main(String[] args) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));

        System.out.println(valor - (valor * 0.05));
    }
}
