package Exercicio2;

import javax.swing.*;


//Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.


public class Ex2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        if (num % 2 != 0 && num > 0) {
            System.out.println(num + " é impar e positivo");
        }
        if (num % 2 != 0 && num < 0){
            System.out.println(num + " é impar e negativo");
        }
        if (num % 2 == 0 && num > 0){
            System.out.println(num + " é par e positivo");
        }
        if (num % 2 == 0 && num < 0){
            System.out.println(num + " é par e negativo");
        }
    }
}
