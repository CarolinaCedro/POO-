package entities;

public class Company extends Tax {

    private Integer numberOfEmployers;

    public Company(){
        super();
    }


    public Company(String name, Double anualIncome, Integer numberOfEmployers) {
        super(name, anualIncome);
        this.numberOfEmployers = numberOfEmployers;
    }

    public Integer getNumberOfEmployers() {
        return numberOfEmployers;
    }

    public void setNumberOfEmployers(Integer numberOfEmployers) {
        this.numberOfEmployers = numberOfEmployers;
    }

    @Override
    public Double doubletax() {
        return null;
    }

}
