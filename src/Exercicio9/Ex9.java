package Exercicio9;


//Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição


import javax.swing.*;

public class Ex9 {
    public static void main(String[] args) {
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("IMC de " + imc + ", abaixo do peso");
        }
        if (imc > 18.5 && imc < 25) {
            System.out.println("IMC de " + imc + ", peso ideal (parabéns)");
        }
        if (imc >= 25 && imc < 30) {
            System.out.println("IMC de " + imc + ", levemente acima do peso");
        }
        if (imc >=30 && imc < 35) {
            System.out.println("IMC de " + imc + ", obesidade grau I");
        }
        if (imc >=35 && imc < 40) {
            System.out.println("IMC de " + imc + ", obesidade grau II");
        }
        if (imc > 40) {
            System.out.println("IMC de " + imc + ", obesidade grau III");
        }
    }
}
