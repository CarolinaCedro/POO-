package aplication;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar ?");
        int n = sc.nextInt();
        int cont = 0;

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0){
                cont++;
            }
        }

        System.out.println("Numeros pares: ");
        for (int i = 0; i < vect.length; i++) {
           if (vect[i] % 2 == 0){
               System.out.printf(" %n"+ vect[i]);
           }
        }
        System.out.println("Quantidade de pares: " + cont);

    }
}
