package Exercicio24;


//Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro.
//Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média,
//distância percorrida e a quantidade de litros utilizados para fazer a viagem.


import javax.swing.*;

public class Ex24 {
    public static void main(String[] args) {
        int tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite a tempo gasto em horas"));
        int velocidadeMedia = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade média da viagem em km"));
        int distancia = tempo * velocidadeMedia;
        int litrosUsados = distancia / 12;

        System.out.println("Distância: " + distancia + "\n" +
                "Litros usados: " + litrosUsados);
    }
}
