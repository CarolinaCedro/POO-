package entities;

public class ImportedProduct extends Product {

    private Double customs;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customs) {
        super(name, price);
        this.customs = customs;
    }

    public Double getCustoms() {
        return customs;
    }

    public void setCustoms(Double customs) {
        this.customs = customs;
    }

    public Double totalPrice(double customsFee) {
        return getPrice() * customsFee / 100;
    }

    @Override
    public String priceTag() {
        return getName() + " $ " + getPrice() + " (Customs fee:  $ " + getCustoms() + ")";
    }
}
