package Exercicio14;


//Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.


import javax.swing.*;

public class Ex14 {
    public static void main(String[] args) {
        int A = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));

        int temp = A;
        A = B;
        B = temp;

        System.out.println("Valor de A = " + A);
        System.out.println("Valor de B = " + B);
    }
}
