package aplication;

import services.Person;

import java.util.Locale;
import java.util.Scanner;

public class Maior_Posicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vet = new double[n];


        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double maior = vet[0];
        int cont = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                cont = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.2f%n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n", cont);

    }
}
