package Exercicio12;


//Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
// pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.


import javax.swing.*;

public class Ex12 {
    public static void main(String[] args) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer?" + "\n" +
                "1 - À vista em dinheiro ou pix, recebe 15% de desconto \n" +
                "2 - À vista no cartão de crédito, recebe 10% de desconto \n" +
                "3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros \n" +
                "4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%"));

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Valor a pagar é de " + (valor - (valor * 0.15)) + "R$");
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "Valor a pagar é de " + (valor - (valor * 0.10)) + "R$");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Valor a pagar é de " + valor + "R$");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Valor a pagar é de " + (valor + (valor * 0.10)) + "R$");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
    }
}
