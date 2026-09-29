void main(){
    Scanner input = new Scanner(System.in);

    IO.println("Insira um número positivo");

    int num = input.nextInt();

    if(num < 0){
        IO.println("Número inválido");
        return;
    }

    int mult = 1;

    while (mult <= 10){
        String out = String.format("%1$s x %2$s = %3$s", num, mult, num*mult);
        IO.println(out);
        mult++;
    }
}
