void main() {
    Scanner input = new Scanner(System.in);

    IO.println("Insira dois números inteiros");

    int n1 = input.nextInt();
    int n2 = input.nextInt();

    input.close();

    if (n1 > n2) {
        IO.println("O primeiro número é maior que o segundo");
    } else if (n2 > n1) {
        IO.println("O segundo número é maior que o primeiro");
    } else {
        IO.println("Os dois números são iguais");
    }

}
