package Exercicio20;


//Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.


import javax.swing.*;

public class Ex20 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        for (int i = 0; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + (i * numero));
        }
    }
}
