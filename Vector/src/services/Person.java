package services;

public class Person {

    private String Name;
    private int Idade;
    private double Height;

    public Person(String name, int idade, double height) {
        Name = name;
        Idade = idade;
        Height = height;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }
}
