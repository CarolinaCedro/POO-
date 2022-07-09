package pessoa;

import java.util.Scanner;

public class Pessoa {

    public String nome;
    public int idade;
    public double peso;


    public void Relatorio(String name, int idade, double peso) {
        System.out.println("Dados Pessoais");
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }

    public void Cadastro(String name, int idade, double peso) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com seu nome: ");
        this.nome = sc.nextLine();
        System.out.println("Entre com sua idade: ");
        this.idade = sc.nextInt();
        System.out.println("Entre com seu peso: ");
        this.peso = sc.nextDouble();
    }

    public void atualizacaoDados(String name, int idade, double peso) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o novo nome: ");
        setNome(sc.nextLine());
        System.out.println("Digite a nova idade: ");
        setIdade(sc.nextInt());
        System.out.println("Digite o novo peso: ");
        setPeso(sc.nextDouble());

        System.out.println("Dados atualizados com sucesso!!");
        System.out.println("Nome:" + getNome());
        System.out.println("Idade:" + getIdade());
        System.out.println("Peso:" + getPeso());


    }

    public void deletandoDados(){
        this.nome = "Sem nome Cadastrado";
        this.idade = 0;
        this.peso = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


}
