import java.util.ArrayList;

public class Empresa {
    private String nome  ="";
    private int quantidade = 0;
    private double preco = 0;
    private double codigo = 0;
    //static double valor_total = 0;

    
    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

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

    public Empresa(){}

    public Empresa(String nome, int quantidade, double preco, int codigo, boolean isEmpresa){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco * quantidade;

        //Quero que ele separe as contas da empresa e do cliente
        if (isEmpresa) {
            Produto.valor_total_empresa += this.preco; //Se ele for empresa, vai juntar os produtos comprados pela empresa
            
        } else {
            Produto.valor_total_cliente += this.preco; //Caso for cliente, junta os valores comprados pelo cliente
        }

        this.codigo = codigo;
    }

    public Empresa(String nome, int quantidade, double preco, int codigo){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco * quantidade;
        this.codigo = codigo;
    }

    public static void exibirDados(ArrayList<Empresa> list) {
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                int j = i + 1;
                System.out.println("\n- Produto da empresa N°" + j);
                System.out.println("Nome do produto: " + list.get(i).getNome());
                System.out.println("Preço do produto: " + list.get(i).getPreco());
                System.out.println("Quantidade do produto: " + list.get(i).getQuantidade());
                System.out.println("Código do produto: " + list.get(i).getCodigo() + "\n");
            }

        } else {
            System.out.println("\n-----> A empresa não comprou produtos. Por favor, tente mais tarde.");
            System.out.println("-----> Caso seja responsável pela empresa, considere comprar produtos com seu fornecedor.\n");
        }
		
	}

}
