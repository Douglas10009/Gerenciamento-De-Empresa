
 public class Cliente {
      
    // nome, endereço, cpf ou cnpj, telefone, código do cliente

    private String nome = ""; 
    private String endereco = "";
    private String cnpj_cpf = "";
    private String telefone = "";
    private int cod_cliente = 0;
    private boolean cad_Cliente = false;

    public boolean getCad_Cliente() {
        return cad_Cliente;
    }

    public void setCad_Cliente(boolean cad_Cliente) {
        this.cad_Cliente = cad_Cliente;
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

    public String getCnpj_cpf() {
        return cnpj_cpf;
    }

    public void setCnpj_cpf(String cnpj_cpf) {
        this.cnpj_cpf = cnpj_cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public Cliente (String nome, String cnpj_cpf, String endereco, String telefone, int cod_cliente){
        this.nome = nome;
        this.cnpj_cpf = cnpj_cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cod_cliente = cod_cliente;
    }

    public Cliente(){}

   
}