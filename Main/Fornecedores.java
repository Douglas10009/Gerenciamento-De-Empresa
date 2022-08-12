
public class Fornecedores  {

    private String nome = ""; 
    private String endereco = "";
    private String cnpj = "";
    private String telefone = "";
    private int cod_fornecedor = 0;
    private static boolean cad_Fornecedor = false;

    public static boolean getCad_Fornecedor() {
        return cad_Fornecedor;
    }

    public void setCad_Fornecedor(boolean cad_Fornecedor) {
        this.cad_Fornecedor = cad_Fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCod_fornecedor() {
        return cod_fornecedor;
    }

    public void setCod_fornecedor(int cod_fornecedor) {
        this.cod_fornecedor = cod_fornecedor;
    }

    public Fornecedores (String nome, String cnpj, String endereco, String telefone, int cod_fornecedor){
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cod_fornecedor = cod_fornecedor;
    }

    public Fornecedores(){}
    
    
}