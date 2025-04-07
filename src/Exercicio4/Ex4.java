package Exercicio4;


//Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.


import javax.swing.*;

public class Ex4 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        System.out.println((num - 1));
        System.out.println((num + 1));
    }
}
