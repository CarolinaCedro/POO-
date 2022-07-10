package entities;

public class Employee {
    public String Name;
    public double GrossSalary;
    public double Tax;


    public double NetSalary() {
        return GrossSalary - Tax;
    }


    public void IncreaseSalary(double percentage) {
        double ajust, salary;
        ajust = GrossSalary * percentage / 100;
        salary = (NetSalary() + ajust);
        System.out.printf("Updated data: %s, $ %.2f", Name, salary);
    }

}
