import java.util.ArrayList;

public class Fornecedores  {

    private String nome = ""; 
    private String endereco = "";
    private String cnpj = "";
    private String telefone = "";
    private int cod_fornecedor = 0;
    private static boolean cad_Fornecedor = false;
    static int total_fornecedores = 0;

    public static boolean getCad_Fornecedor() {
        return cad_Fornecedor;
    }

    public void setCad_Fornecedor(boolean cad_Fornecedor) {
        Fornecedores.cad_Fornecedor = cad_Fornecedor;
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
        total_fornecedores ++;
    }

    public Fornecedores(){}

    public static void exibirDados(ArrayList<Fornecedores> list_forn){ //Exibe os dados da classe 
        for (int i = 0; i < Fornecedores.total_fornecedores; i++) {
            int j = i+1;
            System.out.println("\n-- Fornecedor número " + j);
            System.out.println("\nNome: " + list_forn.get(i).getNome()); 
            System.out.println("Endereço: " + list_forn.get(i).getEndereco()); 
            System.out.println("CNPJ: " + list_forn.get(i).getCnpj()); 
            System.out.println("Telefone: " + list_forn.get(i).getTelefone()); 
            System.out.println("Código: " + list_forn.get(i).getCod_fornecedor()); 
        }
    }

    // public void atualizar_nome(String nome_novo,  ){
    //     SeachDelete.buscarNomeForn(esc_Nome, list_forn);

    // }
    
    
}