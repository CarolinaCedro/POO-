package entities;

public class Register {

    private String Name;
    private String LastName;
    private String City;
    private String Address;
    private String UF;
    private String Cpf;


    public Register(String name, String lastName, String city, String address, String UF, String cpf) {
        Name = name;
        LastName = lastName;
        City = city;
        Address = address;
        this.UF = UF;
        Cpf = cpf;
    }

    @Override
    public String toString() {
        return "Register{" +
                "Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", City='" + City + '\'' +
                ", Address='" + Address + '\'' +
                ", UF='" + UF + '\'' +
                ", Cpf=" + Cpf +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }
}
