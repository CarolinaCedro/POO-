package main;

import rectangle.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Rectangle rec;
        rec = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle width and heigth: ");
        rec.Width = sc.nextDouble();
        rec.Heigth = sc.nextDouble();

        rec.report();


    }
}
