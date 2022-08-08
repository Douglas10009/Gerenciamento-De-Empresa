import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class index {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        clear(); // Limpar a tela
        System.out.println("--------------------------------------");

        System.out.println("\n----> Seja bem vindo a Logistica e CIA :)");
// belo trabalho 
        int opcao = 0;
        ArrayList<Fornecedores> list_forn = new ArrayList<Fornecedores>();
        // ArrayList<String> aulas = new ArrayList<>();

        while (opcao != 6) {

            System.out.println("\n-- Menu Principal --");
            System.out.println("Escolha uma opção -");
            System.out.println("1- Sistema de logistica");
            System.out.println("2 - Sistema de controle");
            System.out.println("3 - Sistema de atualização de dados");
            System.out.println("4 - Sistema de transação");
            System.out.println("5 - Relatório");
            System.out.println("6 - Sair");

            System.out.print("Digite o número da sua opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: // Logistica
                    int opcao_log = 0;
                    int contador = 0; // Para saber se � a primeira vez que o usu�rio entra no menu

                    clear(); // Limpar a tela

                    Fornecedores forn = new Fornecedores(); 
                    boolean cad_Fornecedor = false;
                    while (opcao_log != 3) {
                        System.out.println("-- Sistema de logistica --");
                        System.out.println("> Fornecedores ");
                        System.out.println("Escolha uma opção -");
                        System.out.println("1 - Cadastrar fornecedor");
                        System.out.println("2 - Excluir fornecedores");
                        System.out.println("3 - Voltar");
                        System.out.print("Digite o número da sua opção: ");
                        opcao_log = sc.nextInt();

                        switch (opcao_log) {
                            case 1:
                                clear(); // Limpar tela
                                System.out.println("\n-- Sistema de logistica --");
                                System.out.println("--> Cadastrando o fornecedor");

                                System.out.print("Digite o nome do fornecedor: ");
                                String nome = sc.next();
                                // sc.next(); //Para tirar espaço vazio do buffer
                                System.out.print("Digite o endereço do fornecedor: ");
                                String endereco = sc.next();
                                System.out.print("Digite o CNPJ do fornecedor: ");
                                int cnpj = sc.nextInt();
                                System.out.print("Digite o telefone do fornecedor: ");
                                int telefone = sc.nextInt();
                                System.out.print("Digite o código do fornecedor: ");
                                int cod_fornecedor = sc.nextInt();
                                forn = new Fornecedores(nome, cnpj, endereco, telefone, cod_fornecedor);
                                list_forn.add(forn);
                                cad_Fornecedor = true; // Não ta funcionando, diz que Não há fornecedores criados (Consertado)
                                                       // ERROR

                                // Adicionar agora o poder exluir fornecedor ou add mais

                                System.out.println("\nO nome: " + forn.getNome()); // Debug
                                System.out.println("endereço: " + forn.getEndereco()); // Debug
                                System.out.println("CNPJ: " + forn.getCnpj()); // Debug
                                System.out.println("Telefone: " + forn.getTelefone()); // Debug
                                System.out.println("código do fornecedor: " + forn.getCod_fornecedor()); // Debug
                                System.out.println("Cadastro fornecedor: " + cad_Fornecedor);
                                System.out.println(" "); // Degub
                                break;

                            case 2:
                                System.out.println(cad_Fornecedor); //debug
                                if (cad_Fornecedor == true) {
                                    System.out.println("\n-- Sistema de logistica --");
                                    System.out.println("--> Excluindo o fornecedor");
                                    System.out.println("1 - CNPJ");
                                    System.out.println("2 - código do fornecedor");
                                    System.out.print("Escolha dentre as alternativas para selecionar o m�todo de exclus�o: ");
                                    int excluir_opc = sc.nextInt();

                                    switch (excluir_opc) { //tá dando erro ERROR
                                        case 1:// CNPJ
                                            for (int i = 0; i < list_forn.size(); i++) { 
                                            	System.out.println("\nDigite um dos CNPJ para apagar: ");
                                                System.out.println(list_forn.get(i).getCnpj());// Aq vai mostrar os cpf para excluir o
                                                                       // fornecedor
                                                System.out.print("\nDigite sua escolha:");
                                                int esc_CNPJ = sc.nextInt();
                                                
                                                //int posicao = buscarCnpj(esc_CNPJ, list_forn);
                                                
                                                System.out.print("Tem certeza? 1 - Sim, 2 - Não: ");
                                                int certeza = sc.nextInt();
                                                if (certeza == 1) {
                                                	apagarCnpj(esc_CNPJ, list_forn);
												} else {
													System.out.println("-----> Ação cancelada");
													break;
												}
                                                
                                                
                                                
                                                
                                            }
                                            break; // bom dia Douglas tenta apertar ctrl a + delete alt f4
                
                                        case 2: //código do fornecedor
                                            for (int i = 0; i < 10; i++) { // Mudar isso ak
                                                System.out.println("");// Aq vai mostrar o codigo para excluir o
                                                                       // fornecedor
                                            }
                                            break;
                                        default:
                                            break;
                                    }

                                } else {
                                    System.out.println(
                                            "\n----------> Não há fornecedores cadastrados, cadastre um forncecedor\n"); // ALERT
                                }
                                break;

                            default:
                                break;
                        }
                    }
                    // clearScreen(); //Função de limpar a tela

                    // Cadastrar novos fornecedores
                    // Cadastrar Clientes
                    // Cadastrar Produtos
                    break;
                case 2:// Controle

                    break;
                case 3: // atualização de dados

                    break;
                case 4: // Sistema de transação

                    break;
                case 5: // Relatório

                    break;
                case 6: // Saída

                    break;
                default:
                    System.out.println("opção inválida, tente novamente. ");
                    break;
            }
        }
        sc.close();

    }

    public static void clearScreen() { // M�todo para limpar a tela
        char esc = 27;
        String clear = esc + "[2J"; // codigo ansi para limpar a tela
        System.out.print(clear);
    }

    public static void clear() throws IOException, InterruptedException { // M�todo 2 para limpar a tela
        // Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    }
    
    public static int buscarCnpj(int cnpj ,ArrayList<Fornecedores> list_forn) {
    	for (int i = 0; i < list_forn.size(); i++) {
			if (list_forn.get(i).getCnpj() == cnpj) {
				System.out.println("Posi��o do CNPJ para excluir: " + i);
				return i;
			}
		}
    	return -1;
    }
    
    public static void apagarCnpj(int cnpj, ArrayList<Fornecedores> list_forn) {
    	int posicao = buscarCnpj(cnpj, list_forn);
    	System.out.println("Posi��o do CNPJ: " + posicao);
    	
    	if (posicao != -1) {
			list_forn.remove(posicao);
			System.out.println("\n-----> Fornecedor com o CNPJ " + posicao + " foi apagado com sucesso."); //ALERT
		}else {
			System.out.println("\n-----> CNPJ Não encontrado\n"); //ALERT
		}
    
    }
}

/*
 * System.out.println("Escolha uma opção -");
 * System.out.println("1 - ");
 * System.out.println("2 -");
 * System.out.print("Digite o número da sua opção: ");
 * opcao_ = sc.nextInt();
 */