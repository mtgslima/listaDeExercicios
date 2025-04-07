package Exercicio3;


//Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C
//e imprimir seu valor na tela.


import javax.swing.*;

public class Ex3 {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        int num3;

        if (num1 == num2) {
            num3 = num1 + num2;
        } else {
            num3 = num1 * num2;
        }
        System.out.println(num3);
    }
}
