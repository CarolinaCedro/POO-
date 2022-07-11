package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Media_pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vet = new int[n];
        double sum = 0;
        int cont = 0, impar = 0;
        double media;

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um numero:");
            vet[i] = sc.nextInt();
            if (vet[i] % 2 == 0) {
                sum += vet[i];
                cont++;
            } else {
                impar = 0;
            }
        }

        media = sum / cont;

        if (sum == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }


    }
}
