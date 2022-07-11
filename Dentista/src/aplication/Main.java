package aplication;

import entities.Register;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("-------- DENSTISTA -------- ");
        System.out.println("Cadastro");
        System.out.println("Entre nome do paciente: ");
        String name = sc.nextLine();
        System.out.println("Entre com sobrenome: ");
        String lastName = sc.nextLine();
        System.out.println("Entre com a cidade: ");
        String city = sc.nextLine();
        System.out.println("Entre com endereço: ");
        String address = sc.nextLine();
        System.out.println("Entre com estado: ");
        String uf = sc.nextLine();
        System.out.println("Entre com cpf: ");
        String cpf = sc.nextLine();

        Register person1 = new Register(name,lastName,city,address,uf,cpf);
        System.out.println(person1);
        System.out.println();

        System.out.println("Deseja atualizar informações: (y)sim (n)nao");
        char op = sc.next().charAt(0);

        if (op == 'y'){
            sc.nextLine();
            System.out.println("Novo nome: ");
            name = sc.nextLine();
            person1.setName(name);
            System.out.println("sobrenome: ");
            lastName = sc.nextLine();
            person1.setLastName(lastName);
            System.out.println("cidade: ");
            city = sc.nextLine();
            person1.setCity(city);
            System.out.println("endereco: ");
            address = sc.nextLine();
            person1.setAddress(address);
            System.out.println("estado: ");
            uf = sc.nextLine();
            person1.setUF(uf);
            System.out.println("cpf: ");
            cpf = sc.nextLine();
            person1.setCpf(cpf);

            System.out.println(person1);
        }else{
            System.out.println("Saindo...");
        }


    }
}
