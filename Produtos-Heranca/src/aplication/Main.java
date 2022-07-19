package aplication;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the number of products:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.println("Common, used or imported (c/u/i)? ");
            char op = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();

            if (op == 'i') {
                System.out.println("Customs fee:");
                double cusFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, cusFee);
                productList.add(product);
            } else if (op == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                Product product = new UsedProduct(name, price, date);
                productList.add(product);
            } else {
                Product product = new Product(name, price);
                productList.add(product);
            }
        }

        System.out.println("PRICE TAGS:");
        for (Product product : productList
        ) {
            System.out.println(product.priceTag());
        }

    }
}
