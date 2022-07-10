package rectangle;

public class Rectangle {

    public double Width;
    public double Heigth;


    public double Area() {
        return Width * Heigth;
    }

    public double Perimeter() {
        return (Width * Heigth) + 2;
    }

    public double Diagonal() {
        double diag;
        diag = Math.sqrt(Math.pow(Width, 2) + Math.pow(Heigth, 2));
        return diag;
    }

    public void report() {
        System.out.printf("AREA = %.2f%n", Area());
        System.out.printf("PERIMETER = %.2f%n", Perimeter());
        System.out.printf("DIAGONAL = %.2f%n", Diagonal());
    }
}
