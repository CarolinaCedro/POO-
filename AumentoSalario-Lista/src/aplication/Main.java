package aplication;

import entities.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();
        Client client = new Client();
        List<Client> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Emplyoee #d:%n", i + 1);
            System.out.println("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();
            client = new Client(id, name, salary);
            list.add(client);
        }

        System.out.println("Enter the employee id that will have salary increase :");
        int idAdjust = sc.nextInt();

        Integer res = checkingID(list, idAdjust);

        if (res == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage:");
            double percentagem = sc.nextDouble();
            list.get(res).increase(percentagem);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Client clientes : list
        ) {
            System.out.println(clientes);
        }
    }

    public static Integer checkingID(List<Client> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == id) {
                return i;
            }
        }
        return null;
    }
}
