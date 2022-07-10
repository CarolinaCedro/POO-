package main;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee person;

        person = new Employee();

        System.out.println("Name: ");
        person.Name = sc.nextLine();

        System.out.println("Gross salary: ");
        person.GrossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        person.Tax = sc.nextDouble();

        System.out.println("Employe:"+person.Name+ ", $ "+person.NetSalary());

        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        person.IncreaseSalary(percentage);

    }
}
