package entities;

public class Client {
    private Integer ID;
    private String Name;
    private Double Salary;

    public Client() {
    }

    public Client(Integer ID, String name, Double salary) {
        this.ID = ID;
        Name = name;
        Salary = salary;
    }


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }


    public void increase(double percentagem) {
        Salary += Salary * percentagem / 100.0;
    }

    @Override
    public String toString() {
        return "client{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Salary=" + Salary +
                '}';
    }


}
