package Exercicio8;


//Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.


import javax.swing.*;

public class Ex8 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número"));

        int maior;
        int meio;
        int menor;

        if (num1 > num2 && num1 > num3) {
            maior = num1;
            if (num2 > num3) {
                meio = num2;
                menor = num3;
            } else {
                meio = num3;
                menor = num2;
            }
        } else if (num2 > num1 && num2 > num3){
            maior = num2;
            if (num1 > num3) {
                meio = num1;
                menor = num3;
            } else {
                meio = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 > num2) {
                meio = num1;
                menor = num2;
            } else {
                meio = num2;
                menor = num1;
            }
        }

        System.out.println(maior + "\n" +
                meio + "\n" +
                menor);
    }
}
