package product;

public class Product {

    public String Name;
    public double Price;
    public int Quantity;

    public void report() {
        System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n",Name,Price,Quantity,TotalValueInStock());
    }


    public double TotalValueInStock() {
        return Price * Quantity;
    }


    public void AddProducts(int quantity) {
        this.Quantity += quantity;
    }

    public void RemoveProducts(int quantity) {
        this.Quantity -= quantity;
    }

}
