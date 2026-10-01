void main(){
    Scanner input = new Scanner(System.in);

    IO.println("Eescreva um nome");
    String name = input.nextLine();

    input.close();

    invertString(name);
}

void invertString(String name){
    char[] chars = new char[name.length()];

    for (int i = 0; i < name.length(); i++) {
        chars[i] = name.charAt(i);
    }

    for (int i = 0; i < chars.length; i++) {
        for (int j = 0; j < chars.length - i; j++) {
            if(j > 0){
                char aux = chars[j-1];
                chars[j-1] = chars[j];
                chars[j] = aux;
            }
        }
    }

    String newName = "";

    for (int i = 0; i < chars.length; i++){
        newName += chars[i];
    }
    IO.println(newName);
}
