package aplication;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities_enum.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

        System.out.println("Enter department's name: ");
        String nameDepartment = sc.nextLine();

        System.out.println("Enter worker data:");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Level: ");
        String level = sc.nextLine();
        System.out.println("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(nameDepartment));

        System.out.println("How many contracts to this worker? ");
        int op = sc.nextInt();

        for (int i = 1; i <= op; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.println("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            double value = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int duration = sc.nextInt();
            HourContract contract = new HourContract(contractDate, value, duration);
            worker.addContract(contract);
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthOfYear = sc.next();
        int month = Integer.parseInt(monthOfYear.substring(0, 2));
        int year = Integer.parseInt(monthOfYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.printf("Income for " + monthOfYear + " : " + worker.income(year, month));
    }
}
