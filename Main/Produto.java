public class Produto {

	private int codigo = 0;
	private String nome = "";
	private static boolean cadastro = false;
	private int quantidade_produto = 0;

	public Produto(String nome, int quantidade_produto, int codigo) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade_produto = quantidade_produto;
		
	}
	
	public Produto() {}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(int quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}

	public boolean getCad_Produto() {
        return cadastro;
    }

    public  void setCad_Produto(boolean cad_Produto) {
        Produto.cadastro = cad_Produto;
    }

	
}