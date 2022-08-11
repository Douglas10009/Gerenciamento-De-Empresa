public class Produto {

	private int codigo = 0;
	private String nome = "";
	
	public Produto(String nome, int codigo) {
		this.codigo = codigo;
		this.nome = nome;
		
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

	
}
