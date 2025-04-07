package Exercicio22;

import javax.swing.*;

public class Ex22 {
    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero"));

        double quociente = numero1 / numero2;
        double resto = numero1 % numero2;

        System.out.println("Quociente = " + quociente + "\n" +
                "Resto = " + resto);
    }
}
