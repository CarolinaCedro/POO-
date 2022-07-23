package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.println("Individual or company (i/c)?");
            char op = sc.next().charAt(0);
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Anual income: ");
            double anualIncome = sc.nextDouble();

        }

    }
}
