package main;

import product.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Product prod;
        int qtd;
        prod = new Product();

        System.out.println("Enter product data:");
        System.out.println("Name: ");
        prod.Name = sc.nextLine();

        System.out.println("Price: ");
        prod.Price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        prod.Quantity = sc.nextInt();

        prod.report();

        System.out.println("Enter the number of products to be added in stock:");
        qtd = sc.nextInt();
        prod.AddProducts(qtd);
        prod.report();

        System.out.println("Enter the number of products to be removed from stock:");
        qtd = sc.nextInt();
        prod.RemoveProducts(qtd);
        prod.report();


    }
}
