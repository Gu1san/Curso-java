void main(){
    int[][] matriz = new int[3][3];

    matriz[0][0] = 3;
    matriz[0][1] = 6;
    matriz[0][2] = 34;
    matriz[1][0] = 678;
    matriz[1][1] = 12;
    matriz[1][2] = 76;
    matriz[2][0] = 4;
    matriz[2][1] = 1;
    matriz[2][2] = 78;

    for (int i = 0; i < matriz.length; i++) {
        IO.print("|");
        for (int j = 0; j < matriz.length; j++) {
            IO.print(matriz[i][j] + " |");
        }
        IO.println("\n________");
    }
}
