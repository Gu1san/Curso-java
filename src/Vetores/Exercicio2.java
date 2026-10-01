void main(){
    Scanner input = new Scanner(System.in);

    IO.println("Insira o tamanho do vetor");
    int arrLength = input.nextInt();

    if(arrLength <= 0){
        IO.println("Tamanho inválido");
        return;
    }

    int[] arr = new int[arrLength];

    for (int i = 0; i < arrLength; i++) {
        IO.println("Insira o elemento " + i + " do vetor");
        arr[i] = input.nextInt();
    }

    for (int i = 0; i < arr.length; i++) {
        if(arr[i] % 2 == 0){
            arr[i] *= 2;
        }else{
            arr[i] = (int)Math.pow(arr[i], 2);
        }
    }

    IO.println("Novo vetor: " + Arrays.toString(arr));
}
