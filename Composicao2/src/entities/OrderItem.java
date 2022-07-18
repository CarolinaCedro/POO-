package entities;

public class OrderItem {
    private Integer quantify;
    private Double price;
    private Product product;

    public OrderItem() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OrderItem(Integer quantify, Double price) {
        this.quantify = quantify;
        this.price = price;
    }

    public Integer getQuantify() {
        return quantify;
    }

    public void setQuantify(Integer quantify) {
        this.quantify = quantify;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double subTotal() {
        return quantify * price;
    }
}
