package Exercicio1;

import javax.swing.*;


//Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.


public class Ex1 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));

        int soma = num1 + num2;

        System.out.println("Soma entre o primeiro e o segundo número é " + soma);
        if (soma > num3) {
            System.out.println("O número " + soma + " é maior que " + num3);
        } else {
            System.out.println("O número " + soma + " é menor que " + num3);
        }
    }
}
