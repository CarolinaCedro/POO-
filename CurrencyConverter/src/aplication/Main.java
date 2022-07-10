package aplication;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        CurrencyConverter.priceDollar = sc.nextDouble();
        System.out.println("How many dollars will be bougth? ");
        CurrencyConverter.quantifyBuy = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.convertReais(CurrencyConverter.quantifyBuy));
    }
}
