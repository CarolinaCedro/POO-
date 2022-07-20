package aplication;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapeLists = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.println("Rectangle or Circle (r/c)?");
            char op = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Color (BLACK/BLUE/RED): ");
            String color = sc.nextLine();
            if (op == 'r') {
                System.out.println("Width: ");
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                Shape shape = new Rectangle(Color.valueOf(color), width, height);
                shapeLists.add(shape);
            } else {
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                Shape shape = new Circle(Color.valueOf(color), radius);
                shapeLists.add(shape);
            }

        }

        System.out.println("SHAPE AREAS: ");
        for (Shape lis : shapeLists
        ) {
            System.out.println(String.format("%.2f",lis.area()));
        }

    }
}
