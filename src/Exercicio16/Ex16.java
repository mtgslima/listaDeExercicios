package Exercicio16;


//Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
//equilátero, isósceles ou escaleno.


import javax.swing.*;

public class Ex16 {
    public static void main(String[] args) {
        int ladoA = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do primeiro lado do triângulo"));
        int ladoB = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do segundo lado do triângulo"));
        int ladoC = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do terceiro lado do triângulo"));

        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Triãngulo equilátero");
        }
        if (ladoA == ladoB && ladoB != ladoC) {
            System.out.println("Triãngulo isósceles");
        } else if (ladoA == ladoC && ladoC != ladoB) {
            System.out.println("Triãngulo isósceles");
        } else if (ladoA != ladoB && ladoC == ladoB){
            System.out.println("Triângulo isósceles");
        }
        if (ladoA != ladoB && ladoB != ladoC) {
            System.out.println("Triangulo escaleno");
        }
    }
}
