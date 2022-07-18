package aplication;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enum.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        String birtDate = sc.nextLine();
        Date formatedDate = sdf.parse(birtDate);
        System.out.println("Enter order data: ");
        System.out.println("Status:");
        String status = sc.next();
        System.out.println("How many items to this order? ");
        int op = sc.nextInt();

        for (int i = 1; i <= op; i++) {
            System.out.println("Enter #"+i+" item data:");
            System.out.println("Product name: ");
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            Product product = new Product(productName,productPrice);
            OrderItem orderItem = new OrderItem(quantity,productPrice);



        }


    }
}
