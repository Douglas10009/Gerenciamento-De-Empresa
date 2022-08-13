import java.util.ArrayList;

public class Empresa {
    ArrayList <String> nome_produto; //Nome do produto comprado
    ArrayList <Integer> quantidade_produto; //Quantidade desse produto comprado
    static double valor_total = 0;

    public Empresa(){}

    public Empresa(String nome, Integer quantidade, double preco){
        nome_produto.add(nome); //Adicionar o nome do produto comprado ao array
        quantidade_produto.add(quantidade);  //Adicionar o quantidade do produto comprado ao array
        valor_total += preco;
    }
}
