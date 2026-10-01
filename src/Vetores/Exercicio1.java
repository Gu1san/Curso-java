import java.util.Scanner;


void main(){
    Scanner input = new Scanner(System.in);

    IO.println("Insira o tamanho do vetor");
    int arrLength = input.nextInt();

    if(arrLength <= 0){
        IO.println("Tamanho inválido");
        return;
    }

    float[] arr = new float[arrLength];

    for (int i = 0; i < arrLength; i++) {
        IO.println("Insira o elemento " + i + " do vetor");
        arr[i] = input.nextFloat();
    }

    sort(arr);

    input.nextLine();
    IO.println("Agora escreva um nome");
    String name = input.nextLine();

    vocalCount(name);
    input.close();
}

public static void sort(float[] arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length; j++) {
            if(arr[j] < arr[i]){
                float aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
            }
        }
    }
    IO.println(Arrays.toString(arr));
}

public void vocalCount(String name){
    int counter = 0;

    for (int i = 0; i < name.length(); i++) {
        switch(name.toLowerCase().charAt(i)){
            case 'a':
                counter++;
                break;
            case 'e':
                counter++;
                break;
            case 'i':
                counter++;
                break;
            case 'o':
                counter++;
                break;
            case 'u':
                counter++;
                break;
        }
    }

    IO.println("Número de vogais: " + counter);
}
