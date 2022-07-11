package aplication;

import services.Person;

import java.util.Locale;
import java.util.Scanner;

public class Ficha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas ? ");
        int n = sc.nextInt();
        Person [] vect = new Person[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa:%n",i+1);
            System.out.println("Nome:");
            String name = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double heigth = sc.nextDouble();
            vect[i] = new Person(name,idade,heigth);
        }


    }
}
