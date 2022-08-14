import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Empresa {
    ArrayList <String> nome_produto; //Nome do produto comprado
    ArrayList <Integer> quantidade_produto; //Quantidade desse produto comprado
    Dictionary<String, Integer> nome_quantidade = new Hashtable<String, Integer>(); //Dicionário que recebe 2 valores, o nome do produto comprado, e a quantidade respectivamente

    static double valor_total = 0;

    public Empresa(){}

    public Empresa(String nome, Integer quantidade, double preco){
        nome_produto.add(nome); //Adicionar o nome do produto comprado ao array
        quantidade_produto.add(quantidade);  //Adicionar o quantidade do produto comprado ao array
        //nome_quantidade. //Coloca o

        valor_total += preco; //Para saber o total das compras
    }
}
