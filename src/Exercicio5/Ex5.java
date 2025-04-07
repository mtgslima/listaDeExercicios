package Exercicio5;


//Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).


import javax.swing.*;

public class Ex5 {
    public static void main(String[] args) {
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário"));
        double salarioMinimo = 1293.20;
        double salarioConvertido = salario / salarioMinimo;


        System.out.println("O seu salário equivale à " + salarioConvertido + " salários mínimos");
    }
}
