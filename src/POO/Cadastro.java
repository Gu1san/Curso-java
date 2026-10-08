package POO;

import java.util.Scanner;

public class Cadastro {
    static void main() {
        Scanner input = new Scanner(System.in);

        IO.println("Quantos carros deseja cadastrar? (Máx. 50)");

        int amount = input.nextInt();

        if(amount < 1 || amount > 50){
            IO.println("Valor inválido");
            return;
        }

        Carro[] carros = new Carro[amount];
        float soma = 0;

        for (int i = 0; i < amount; i++) {
            input.nextLine();

            IO.println("Cadastro do carro " + (i + 1));

            IO.println("Nome do carro:");
            String nome = input.nextLine();

            IO.println("Cor do carro:");
            String cor = input.nextLine();

            IO.println("Ano do carro:");
            int ano = input.nextInt();

            IO.println("Preço do carro:");
            float preco = input.nextFloat();

            carros[i] = new Carro(nome, preco, cor, ano);

            soma += preco;
        }

        input.close();

        IO.println("Carros criados:");

        for (Carro carro : carros) {
            IO.println(carro.nome);
        }

        IO.println(amount + " carros cadastrados\n");
        IO.println("Soma do valor de todos os carros: " + soma);

    }
}
