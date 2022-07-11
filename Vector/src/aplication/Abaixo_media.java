package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vet = new double[n];
        double sum = 0, media = 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um numero:");
            vet[i] = sc.nextDouble();
            sum += vet[i];
        }
        media = sum / vet.length;
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (Double res : vet
        ) {
            if (res < media) {
                System.out.println(res);
            }
        }

    }
}
