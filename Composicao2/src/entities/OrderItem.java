package entities;

public class OrderItem {

    private Product product;
    private Double price;
    private Integer quantify;


    public OrderItem() {
    }



    public OrderItem(Integer quantify, Double price, Product product) {
        this.product = product;
        this.price = price;
        this.quantify = quantify;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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

    @Override
    public String toString() {
        return getProduct().getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantify
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
