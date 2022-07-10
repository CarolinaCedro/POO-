package product;

public class Product {

    public String Name;
    public double Price;
    public int Quantity;

    public void report(String Name, double Price, int quantity) {
        System.out.println("Enter product data: ");
        System.out.println("Name: "+Name);
        System.out.println("Price: "+Price);
        System.out.println("Quantity in stock: "+quantity);
    }

}
