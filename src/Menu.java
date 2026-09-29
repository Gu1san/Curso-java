void main(){
    Scanner input = new Scanner(System.in);
    int option = 0;

    do{
        IO.println("Menu");
        IO.println("1 - Continuar");
        IO.println("2 - Sair");

        option = input.nextInt();
        input.nextLine();
        if(option == 1){
            IO.println("Escreva algo");
            String txt = input.nextLine();
            IO.println("Você escreveu: " + txt);
        }
        else if(option == 2){
            IO.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
        }
        else{
            IO.println("Opção inválida");
        }
    }while(option != 2);
    input.close();
}
