package Exercicio17;


//Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.


import javax.swing.*;

public class Ex17 {
    public static void main(String[] args) {
        int opcao;
        double celsius = 0;
        double fahr = 0;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione qual conversão gostaria de fazer \n" +
                    "0 - Celsius para Fahrenheit \n" +
                    "1 - Fahrenheit para Celsius \n" +
                    "3 - Fechar"));

            switch (opcao) {
                case 0:
                    celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura que deseja converter em Fahrenheit"));
                    double celsiusConvertido = (32 + (celsius * (9 / 5)));
                    JOptionPane.showMessageDialog(null, "Celsius " + celsius + " = " + celsiusConvertido + " Fahrenheit");
                    break;
                case 1:
                    fahr = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura que deseja converter em Celsius"));
                    double fahrConvertido = ((fahr - 32) * 5 / 9);
                    JOptionPane.showMessageDialog(null, "Celsius " + fahr + " = " + fahrConvertido + " Fahrenheit");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Fechando");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        } while (opcao != 3);
    }
}
