package aplication;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Employee #" + i + " data:");
            System.out.println("Outsourced (y/n)? ");
            char op = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (op == 'y') {
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employeeList.add(employee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                employeeList.add(employee);
            }

        }

        System.out.println("PAYMENTS:");
        for (Employee list : employeeList
        ) {
            System.out.println(list.getName() + " - $  " + list.payment());
        }
    }
}
