package main;

import product.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product prod;

        prod = new Product();

        System.out.println("Nome produto: ");
        prod.Name = sc.nextLine();

        System.out.println("Preco produto: ");
        prod.Price = sc.nextDouble();

        System.out.println("Quantidade no estoque: ");
        prod.Quantity = sc.nextInt();

    }
}
