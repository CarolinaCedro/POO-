package aplication;

import entities.Transactions;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Transactions transactions = new Transactions();


        System.out.println("------- BANK -------");
        System.out.println("Enter account number: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder:: ");
        String Name = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)?");
        char op = sc.next().charAt(0);
        switch (op) {
            case 'y':
                System.out.println("Enter initial deposit value: ");
                double initialValue = sc.nextDouble();
                transactions = new Transactions(id, Name, initialValue);
                break;
            case 'n':
                System.out.println("Completly");
                transactions = new Transactions(id, Name);
                break;
        }


        System.out.println("Account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", transactions.getId(), transactions.getName(), transactions.getInitialDeposit());

        System.out.println("Enter a deposit value:");
        double deposit = sc.nextDouble();
        transactions.amountAdd(deposit);
        System.out.println("Updated account data:");
        transactions.report();
        System.out.println("Enter a withdraw value:");
        double witdraw = sc.nextDouble();
        System.out.println(transactions.getAmount());
        transactions.amountRemove(witdraw);
        transactions.report();
        System.out.println(transactions.getAmount());


    }
}
