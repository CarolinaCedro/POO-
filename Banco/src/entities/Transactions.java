package entities;

public class Transactions {


    private int id;
    private String Name;
    private double initialDeposit;
    private double amount;

    public Transactions() {
    }

    public Transactions(int id, String Name, double initialDeposit) {
        this.id = id;
        this.Name = Name;
        this.initialDeposit = initialDeposit;
    }

    public Transactions(int id, String Name) {
        this.id = id;
        this.Name = Name;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getId() {
        return id;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void report() {
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", id, Name, initialDeposit);
    }

    public void deposit(double valueAmount) {
        initialDeposit += valueAmount;
    }

    public void witdraw(double valueAmount) {
        initialDeposit -= valueAmount + 5.00;
    }


}
