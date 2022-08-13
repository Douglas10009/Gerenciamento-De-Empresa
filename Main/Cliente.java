import java.util.ArrayList;

public class Cliente {
      
    // nome, endereço, cpf ou cnpj, telefone, código do cliente

    private String nome = ""; 
    private String endereco = "";
    private String cnpj_cpf = "";
    private String telefone = "";
    private int cod_cliente = 0;
    private static boolean cad_Cliente = false;
    static int total_cliente = 0;

    public static boolean getCadastro() {
        return cad_Cliente;
    }

    public void setCadastro(boolean cad_Cliente) {
        Cliente.cad_Cliente = cad_Cliente;
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

    public int getCodigo() {
        return cod_cliente;
    }

    public void setCodigo(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public Cliente (String nome, String cnpj_cpf, String endereco, String telefone, int cod_cliente){
        this.nome = nome;
        this.cnpj_cpf = cnpj_cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cod_cliente = cod_cliente;
        total_cliente ++;
    }

    public Cliente(){}

    public static void exibirDados(ArrayList<Cliente> list_cliente){
        for (int i = 0; i < Fornecedores.total_fornecedores; i++) {
            int j = i+1;
            System.out.println("\n-- Cliente número " + j);
            System.out.println("\nNome: " + list_cliente.get(i).getNome()); 
            System.out.println("Endereço: " + list_cliente.get(i).getEndereco()); 
            System.out.println("CNPJ/CPF: " + list_cliente.get(i).getCnpj_cpf()); 
            System.out.println("Telefone: " + list_cliente.get(i).getTelefone()); 
            System.out.println("Código: " + list_cliente.get(i).getCodigo()); 
        }
    }

   
}