package aplication;

import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Login {

    static List<User> userList = new ArrayList<>();

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        User user = new User();

        int op = 1;

        while (op != 0) {

            System.out.println("--- Menu ---");
            System.out.println("(1)Cadastrar usuario");
            System.out.println("(2)Editar usuario");
            System.out.println("(3)Listar usuarios");
            System.out.println("(4)Apagar usuarios");
            System.out.println("(0)Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    inputData();
                    break;
                case 2:
                    System.out.println("teste update");
                    break;
                case 3:
                    listUsers();
                    break;
                case 4:
                    System.out.println("test delete");
                    break;
                default:
                    System.out.println("Saindo...");
            }
        }
    }

    public static void inputData() {

        User user;

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("-------- DECADRONE SYSTEM --------");
        System.out.println("- Registration form -");
        System.out.println("Enter for id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("First name: ");
        String firstName = sc.nextLine();
        System.out.println("Last name: ");
        String lastName = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Gender: ");
        String gender = sc.nextLine();
        System.out.println("Birtday: ");
        String birtday = sc.nextLine();
        System.out.println("City: ");
        String city = sc.nextLine();
        System.out.println("Phone number: ");
        int phone = sc.nextInt();

        User users = new User(firstName, lastName, email, gender, birtday, city, phone, id);
        userList.add(users);
    }


    public static void listUsers() {
        for (User res : userList
        ) {
            System.out.println(res);
        }
    }


}
