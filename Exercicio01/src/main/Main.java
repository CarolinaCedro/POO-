package main;

import pessoa.Pessoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pessoa pes = new Pessoa();

        int op = 1, loop = 0;
        Scanner sc = new Scanner(System.in);

        while (op != 0) {
            System.out.println("+++++++Cadastro+++++++");
            System.out.println("(1)Criar Usuario");
            System.out.println("(2)Editar Usuario");
            System.out.println("(3)Deletar Usuario");
            System.out.println("(4)Mostrar Usuario");
            System.out.println("(0)Sair");
            op = sc.nextInt();
            System.out.println();
            switch (op) {
                case 1:
                    pes.Cadastro(pes.nome, pes.idade, pes.peso);
                    break;
                case 2:
                    pes.atualizacaoDados(pes.getNome(), pes.getIdade(), pes.getPeso());
                    break;
                case 3:
                    pes.deletandoDados();
                    break;
                case 4:
                    pes.Relatorio(pes.nome, pes.idade, pes.peso);
                    break;
                default:
                    System.out.println("Saindo...");
            }
        }


        sc.close();
    }
}
