package Exercicio7;


//Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.


import javax.swing.*;

public class Ex7 {
    public static void main(String[] args) {
        boolean A = Boolean.parseBoolean(JOptionPane.showInputDialog("True or false?"));
        boolean B = Boolean.parseBoolean(JOptionPane.showInputDialog("True or false?"));

        if (A && B) {
            System.out.println("Ambos são verdadeiros");
        } else if (!A && !B) {
            System.out.println("Ambos são falsos");
        } else {
            System.out.println("Valores diferentes");
        }
    }
}
