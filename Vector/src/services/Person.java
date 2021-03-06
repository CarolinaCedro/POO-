package services;

public class Person {

    private String Name;
    private int Idade;
    private double Height;
    private Integer vet[] = new Integer[5];


    public Person() {
    }
    @Override
    public String toString() {
        return "Dados" + "\n" +
                "Nome = " + Name + "\n" +
                "Idade = " + Idade + "\n" +
                "Altura = " + Height;
    }

    public Person(String name, int idade, double height) {
        Name = name;
        Idade = idade;
        Height = height;
    }

    public Integer[] getVet() {
        return vet;
    }

    public void setVet(Integer[] vet) {
        this.vet = vet;
    }

    public Person(Integer num) {
        vet[5]= num;
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


    public double alturaMedia(double altura, int qtd) {
        return altura / qtd;
    }

    public double heigthPersons(double qtdPerson, int qtd) {
        return qtdPerson * 100.0 / qtd;
    }
}
