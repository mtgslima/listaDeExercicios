package Exercicio21;


//Faça um algoritmo que mostre um valor aleatório entre 0 e 100.


public class Ex21 {
    public static void main(String[] args) {
        int numero = (int) (Math.random() * 101);
        System.out.println("número aleatório entre 0 e 100: " + numero);
    }
}
