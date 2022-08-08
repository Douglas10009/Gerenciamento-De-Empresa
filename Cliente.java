package Questao01.Questao02.Trabalho_alg_2;

 public class Cliente {
      
    // nome, endereço, cpf ou cnpj, telefone, código do cliente) 

    private String nome;
    private String endereco;
    private int cpf;
    private int telefone;
    private int codigo_Cliente;

    public Cliente ( String n, String end, int cpf, int tele, int codcliente){
       this.setCpf(cpf);
       this.setCodigo_Cliente(codcliente);
       this.setEndereco(end);
       this.setNome(n);

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
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;

    }
    
    public int getCodigo_Cliente() {
        return codigo_Cliente;
    }
    public void setCodigo_Cliente(int codigo_Cliente) {
        this.codigo_Cliente = codigo_Cliente;
    }

   
}

