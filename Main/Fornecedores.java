import java.util.ArrayList;

public class Fornecedores  {
    //nome, endere�o, cnpj, telefone, c�digo do fornecedor

    
    private String nome = ""; //Prov�vel vai ter q mudar pq public � "falha" de seguran�a
    private String endereco = "";
    private int cnpj = 0;
    private String telefone = "";
    private int cod_fornecedor = 0;

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

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
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

    public Fornecedores (String nome, int cnpj, String endereco, String telefone, int cod_fornecedor){
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cod_fornecedor = cod_fornecedor;
    }

    public Fornecedores(){}
    
    
}