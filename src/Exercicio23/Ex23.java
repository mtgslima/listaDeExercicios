package Exercicio23;


// Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
// As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS.
// Imprima na tela o salário líquido final.


import javax.swing.*;

public class Ex23 {
    public static void main(String[] args) {
        int valorHora = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da hora aula"));
        int aulasMes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de aulas lecionadas no mês"));
        int percentualINSS = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual descontado do INSS"));

        double salarioBruto = valorHora * aulasMes;
        double descontoINSS = (salarioBruto * percentualINSS) / 100;
        double salarioLiquido = salarioBruto - descontoINSS;
        System.out.println("Salário bruto é de " + salarioBruto + "R$ \n" +
                "Salário líquido é de " + salarioLiquido + "R$");
    }
}
