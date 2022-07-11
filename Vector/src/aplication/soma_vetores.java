package aplication;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor?");
        int n = sc.nextInt();
        int[] vetA = new int[n];
        int[] vetB = new int[n];
        int[] vetC = new int[n];

        System.out.println("Digite os valores do vetor");
        for (int i = 0; i < vetA.length; i++) {
            System.out.println("Valor para vetor A: ");
            vetA[i] = sc.nextInt();
            System.out.println("Valor para vetor B: ");
            vetB[i] = sc.nextInt();
            vetC[i] = vetA[i] + vetB[i];
        }

        System.out.println("VETOR RESULTANTE:");
        for (Integer res : vetC
        ) {
            System.out.println(res);
        }
    }
}
