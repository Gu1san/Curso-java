void main() {
    Scanner input = new Scanner(System.in);

    IO.println("Insira um nome de usuário e um número positivo");

    String name = input.nextLine();
    int num = input.nextInt();

    input.close();

    if(num <= 0) {
        IO.println("Número inválido");
        return;
    }

    IO.println(numSequence(num));

    if(name.length() <= 6){
        IO.println(name);
    }else{
        for(int i = 0; i < num; i++){
            IO.println(name);
        }
    }
}

String numSequence(int num){
    String output = "";
    for(int i = 0; i < num + 1; i++){
        output += i + ", ";
    }

    for(int i = num; i >= 0; i--){
        output += i + ", ";
    }

    return(output);
}