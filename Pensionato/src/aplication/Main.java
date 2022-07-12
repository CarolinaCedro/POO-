package aplication;

import services.Guest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Guest[] quartos = new Guest[10];

        System.out.println("How many rooms will be rented?  ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Rent #%d:%n", i + 1);
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int room = sc.nextInt();
            quartos[room] = new Guest(name, email, room);
        }

        for (Guest res : quartos
        ) {
            if (res != null) {
                System.out.println(res);
            }
        }
    }
}
