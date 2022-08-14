import java.util.ArrayList;

public class Empresa {
    private String nome  ="";
    private int quantidade = 0;
    private double preco = 0;
    static double valor_total = 0;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static double getValor_total() {
        return valor_total;
    }

    public static void setValor_total(double valor_total) {
        Empresa.valor_total = valor_total;
    }

    public Empresa(){}

    public Empresa(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco * quantidade;
        Produto.valor_total += this.preco;
    }

    public static void exibirDados(ArrayList<Produto> list) {
		for (int i = 0; i < list.size(); i++) {
			int j = i + 1;
			System.out.println("\n- Produto N°" + j);
			System.out.println("Nome do produto: " + list.get(i).getNome());
			System.out.println("Preço do produto: " + list.get(i).getPreco_produto());
			System.out.println("Quantidade do produto: " + list.get(i).getQuantidade_produto());
			System.out.println("Código do produto: " + list.get(i).getCodigo() + "\n");
		}
	}

}
