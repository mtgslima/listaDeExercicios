package Exercicio15;


//Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
//consideração o ano com 365 dias e o mês com 30 dias.
//(Ex: 5 anos, 2 meses e 15 dias de vida)


import javax.swing.*;

public class Ex15 {
    public static void main(String[] args) {
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));

        int anoAtual = 2025;
        int idadeAnos = anoAtual - anoNascimento;
        int idadeDiasTotal = idadeAnos * 365;

        int anos = idadeDiasTotal / 365;
        int meses = (idadeDiasTotal % 365) / 30;
        int dias = (idadeDiasTotal % 365) % 30;

        System.out.println("Você viveu aproximadamente: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
    }
}
