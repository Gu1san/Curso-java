package POO;

import java.util.Scanner;

public class Cadastro {
    static void main() {
        Scanner input = new Scanner(System.in);

        IO.println("Quantos alunos deseja cadastrar? (Máx. 50)");

        int amount = input.nextInt();

        if(amount < 1 || amount > 50){
            IO.println("Valor inválido");
            return;
        }

        Aluno[] alunos = new Aluno[amount];
        float soma = 0;

        for (int i = 0; i < amount; i++) {
            input.nextLine();

            IO.println("Cadastro do aluno " + (i + 1));

            IO.println("Nome do aluno:");
            String nome = input.nextLine();

            IO.println("Quantas notas o aluno tem?");
            int quant = input.nextInt();
            float[] notas = new float[quant];
            for (int j = 0; j < quant; j++) {
                float nota = -1;

                do{
                    IO.println("Valor da nota " + (j+1));
                    nota = input.nextFloat();

                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                    }
                }while(nota < 0 || nota > 10);

                notas[j] = nota;
            }

            alunos[i] = new Aluno(nome, notas);
        }

        input.close();

        IO.println("Alunos cadastrados:");

        for (Aluno aluno : alunos) {
            IO.println(aluno);
        }
    }
}
