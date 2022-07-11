package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        double[] vec = new double[n];
        double sum = 0, media;

        for (int i = 0; i < vec.length; i++) {
            System.out.println("Digite um numero: ");
            vec[i] = sc.nextDouble();
            sum += vec[i];
        }

        System.out.print("\nValores = ");
        for (int i = 0; i < vec.length; i++) {
            System.out.print(" " + vec[i]);
        }

        media = sum / n;
        System.out.println("\nSoma = " + sum);
        System.out.println("\nMedia = " + media);

    }
}
