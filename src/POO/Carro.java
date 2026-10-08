package POO;

public class Carro {
    public String nome;
    public float valor;
    public String cor;
    public int ano;

    public Carro(String nome, float valor, String cor, int ano){
        this.nome = nome;
        this.valor = valor;
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" + "nome='" + nome + '\'' + ", ano=" + ano + '\'' + "cor= " + cor + '\n' + "Preço= " + valor + '}';
    }
}
