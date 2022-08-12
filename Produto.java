public class Produto {

	private int codigo = 0;
	private String nome = "";
	private boolean cad_Produto = false;

    public boolean getCad_Produto() {
        return cad_Produto;
    }

    public void setCad_Produto(boolean cad_Produto) {
        this.cad_Produto = cad_Produto;
    }
	
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