import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class index {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);


        //sandbox de variáveis
        int opcao = 0;
        String nome_fornecedor = "";
        String nome_cliente = "";
        String nome_produto = "";
        ArrayList<Fornecedores> list_forn = new ArrayList<Fornecedores>();
        ArrayList<Cliente> list_cliente = new ArrayList<Cliente>();
        ArrayList<Produto> list_produto = new ArrayList<Produto>();
        //Fim 

        
        clear(); // Limpar a tela

        System.out.println("--------------------------------------");
        System.out.println("\n----> Seja bem vindo a Logistica e CIA :)"); // belo trabalho
        

        while (opcao != 6) {

            //clear();

            System.out.println("\n-- Menu Principal --");
            System.out.println("Escolha uma opção: ");
            System.out.println("1- Sistema de logistica");
            System.out.println("2 - Sistema de controle (BREVE)");
            System.out.println("3 - Sistema de atualização de dados (BREVE)");
            System.out.println("4 - Sistema de transação - Compra e Venda (BREVE)");
            System.out.println("5 - Relatório (BREVE)");
            System.out.println("6 - Sair ");
            System.out.print("Digite o número da sua opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: // Logistica
                    int opcao_log_fornecedores = 0; //Navegação do menu principal dos fornecedores
                    int opcao_log_cliente = 0; //Navegação do menu principal dos clientes
                    int opcao_log_produto = 0; //Navegação do menu principal dos produtos

                    clear(); // Limpar tela

                    System.out.println("-- Sistema de logistica --");
                    System.out.println(">  Gerenciamento ");
                    System.out.println("1- Gerenciamento fornecedores");
                    System.out.println("2- Gerenciamento clientes");
                    System.out.println("3- Gerenciamento produtos");
                    System.out.println("4 - Voltar");
                    System.out.print("Digite sua opção: ");
                    int opc_gerenciamento = sc.nextInt();

                    clear(); // Limpar a tela

                    switch (opc_gerenciamento) {
                        case 1:// Gerenciar Fornecedor

                            Fornecedores forn = new Fornecedores();
                            //boolean cad_Fornecedor = false;

                            while (opcao_log_fornecedores != 3) {

                                System.out.println("-- Sistema de logistica --");
                                System.out.println("-> Fornecedores ");
                                System.out.println("Escolha uma opção -");
                                System.out.println("1 - Cadastrar fornecedor");
                                System.out.println("2 - Excluir fornecedores");
                                System.out.println("3 - Voltar");
                                System.out.print("Digite o número da sua opção: ");
                                opcao_log_fornecedores = sc.nextInt();
                                sc.nextLine(); // Tirar enter do buffer

                                switch (opcao_log_fornecedores) {

                                    case 1:// Cadastrar fornecedor

                                        clear(); // Limpar tela

                                        System.out.println("\n-- Sistema de logistica --");
                                        System.out.println("--> Cadastrando o fornecedor");
                                        System.out.print("Digite o nome do fornecedor: ");
                                        nome_fornecedor = sc.nextLine();
                                        System.out.print("Digite o endereço do fornecedor: ");
                                        String endereco = sc.nextLine();
                                        System.out.print("Digite o CNPJ do fornecedor:  ");
                                        String cnpj = sc.nextLine();
                                        // sc.nextLine(); // Tirar enter do Buffer
                                        System.out.print("Digite o telefone do fornecedor: ");
                                        String telefone = sc.nextLine();
                                        System.out.print("Digite o código do fornecedor: ");
                                        int cod_fornecedor = sc.nextInt();

                                        forn = new Fornecedores(nome_fornecedor, cnpj, endereco, telefone, cod_fornecedor);
                                        forn.setCad_Fornecedor(true);// Variável para definir que criou ao menos um fornecedor
                                        list_forn.add(forn);
                                        //cad_Fornecedor = true; // Variável para definir que criou ao menos um fornecedor

                                        System.out.println("\n-----> O fornecedor, " + forn.getNome() + " foi criado! \n"); // ALERT
                                        break;

                                    case 2: // Excluir Fornecedor
                                        if (forn.getCad_Fornecedor() == true) {
                                            System.out.println("\n \n-- Sistema de logistica --");
                                            System.out.println("--> Excluindo o fornecedor");
                                            System.out.println("1 - CNPJ");
                                            System.out.println("2 - código do fornecedor");
                                            System.out.print(
                                                    "Escolha dentre as alternativas para selecionar o método de exclusão: ");
                                            int excluir_opc = sc.nextInt();

                                            sc.nextLine(); // Tirar enter do buffer

                                            switch (excluir_opc) {
                                                case 1:// CNPJ
                                                    System.out.println("\nDigite um dos CNPJ para apagar: ");

                                                    for (int i = 0; i < list_forn.size(); i++) {
                                                        System.out.println(list_forn.get(i).getCnpj());// Aqui vai
                                                                                                       // mostrar os cpf
                                                                                                       // para excluir o
                                                                                                       // fornecedor
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    String esc_CNPJ = sc.nextLine();
                                                    System.out.print("Tem certeza? [1 - Sim, 2 - Não]: ");
                                                    int certeza = sc.nextInt();

                                                    if (certeza == 1) {
                                                        SeachDelete.apagarCnpj(esc_CNPJ, list_forn, forn.getCad_Fornecedor());

                                                        if (list_forn.size() < 1) {
                                                            forn.setCad_Fornecedor(false);
                                                        }

                                                    } else {

                                                        clear(); // Limpar tela

                                                        System.out.println("\n-----> Ação cancelada\n");
                                                        break;

                                                    }
                                                    break;

                                                case 2: // código do fornecedor
                                                    System.out.println(
                                                            "\nDigite um dos códigos dos fornecedores para apagar: ");

                                                    for (int i = 0; i < list_forn.size(); i++) {
                                                        System.out.println(list_forn.get(i).getCod_fornecedor());// Aq
                                                                                                                 // vai
                                                                                                                 // mostrar
                                                                                                                 // os
                                                                                                                 // cpf
                                                                                                                 // para
                                                                                                                 // excluir
                                                                                                                 // o
                                                                                                                 // fornecedor
                                                    }
                                                    System.out.print("\nDigite sua escolha:");
                                                    int esc_Fornecedor = sc.nextInt();

                                                    System.out.print("Tem certeza? 1 - Sim, 2 - Não: ");
                                                    int certeza2 = sc.nextInt();

                                                    if (certeza2 == 1) {
                                                        SeachDelete.apagarCodigoFornecedor(esc_Fornecedor,
                                                                list_forn, forn.getCad_Fornecedor());

                                                        if (list_forn.size() < 1) {
                                                            forn.setCad_Fornecedor(false);
                                                        }

                                                    } else {
                                                        System.out.println("\n-----> Ação cancelada\n");
                                                        break;
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
                            break;

                        case 2:// Gerenciar cliente

                            Cliente cliente = new Cliente(); //Construtor do cliente
                            //boolean cad_Cliente = false; //Verificar se o cliente está cadastrado

                            while (opcao_log_cliente != 3) {

                                System.out.println("-- Sistema de logistica --");
                                System.out.println("-> Cliente ");
                                System.out.println("Escolha uma opção -");
                                System.out.println("1 - Cadastrar cliente");
                                System.out.println("2 - Excluir cliente");
                                System.out.println("3 - Voltar");
                                System.out.print("Digite o número da sua opção: ");
                                opcao_log_cliente = sc.nextInt();
                                sc.nextLine(); // Tirar enter do buffer

                                switch (opcao_log_cliente) {

                                    case 1:// Cadastrar cliente

                                        clear(); // Limpar tela

                                        System.out.println("\n-- Sistema de logistica --");
                                        System.out.println("--> Cadastrando o cliente");
                                        System.out.print("Digite o nome do cliente: ");
                                        nome_cliente = sc.nextLine();
                                        System.out.print("Digite o endereço do cliente: ");
                                        String endereco_cliente = sc.nextLine();
                                        System.out.print("Digite o CNPJ/CPF do cliente:  ");
                                        String cnpj_cpf_cliente = sc.nextLine();
                                        // sc.nextLine(); // Tirar enter do Buffer
                                        System.out.print("Digite o telefone do cliente: ");
                                        String telefone = sc.nextLine();
                                        System.out.print("Digite o código do cliente: ");
                                        int cod_cliente = sc.nextInt();

                                        cliente = new Cliente(nome_cliente, cnpj_cpf_cliente, endereco_cliente, telefone, cod_cliente);
                                        cliente.setCad_Cliente(true);// Variável para definir que criou ao menos um cliente -- MUDEI AQ
                                        list_cliente.add(cliente);

                                        // cad_Cliente = true; 

                                        System.out.println("\n-----> O cliente, " + nome_cliente + " foi criado! \n"); // ALERT
                                        break;

                                    case 2: // Excluir cliente
                                        if (cliente.getCad_Cliente() == true) { //MUDEI AQ
                                            System.out.println("\n \n-- Sistema de logistica --");
                                            System.out.println("--> Excluindo o cliente");
                                            System.out.println("1 - CNPJ");
                                            System.out.println("2 - código do cliente");
                                            System.out.print(
                                                    "Escolha dentre as alternativas para selecionar o método de exclusão: ");
                                            int excluir_opc = sc.nextInt();

                                            sc.nextLine(); // Tirar enter do buffer

                                            switch (excluir_opc) {
                                                case 1:// CNPJ
                                                    System.out.println("\nDigite um dos CNPJ/CPF para apagar: ");

                                                    for (int i = 0; i < list_cliente.size(); i++) {
                                                        System.out.println(list_cliente.get(i).getCnpj_cpf());// Aqui vai
                                                                                                       // mostrar os cpf
                                                                                                       // para excluir o
                                                                                                       // cliente
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    String esc_CNPJ_CPF = sc.nextLine();
                                                    System.out.print("Tem certeza? [1 - Sim, 2 - Não]: ");
                                                    int certeza = sc.nextInt();

                                                    if (certeza == 1) {
                                                        SeachDelete.apagarCnpj_Cpf(esc_CNPJ_CPF, list_cliente, cliente.getCad_Cliente());

                                                        if (list_cliente.size() < 1) {
                                                            cliente.setCad_Cliente(false);
                                                        }

                                                    } else {

                                                        clear(); // Limpar tela

                                                        System.out.println("\n-----> Ação cancelada\n");
                                                        break;

                                                    }
                                                    break;

                                                case 2: // código do cliente
                                                    System.out.println(
                                                            "\nDigite um dos códigos dos Cliente para apagar: ");

                                                    for (int i = 0; i < list_cliente.size(); i++) {
                                                        System.out.println(list_cliente.get(i).getCod_cliente());// Aq
                                                                                                              // vai
                                                                                                              // mostrar
                                                                                                              // os
                                                                                                              // cpf
                                                                                                              // para
                                                                                                              // excluir
                                                                                                              // o
                                                                                                              // cliente
                                                    }
                                                    System.out.print("\nDigite sua escolha:");
                                                    int esc_cliente = sc.nextInt();

                                                    System.out.print("Tem certeza? 1 - Sim, 2 - Não: ");
                                                    int certeza2 = sc.nextInt();

                                                    if (certeza2 == 1) {
                                                        SeachDelete.apagarCodigoCliente(esc_cliente,
                                                                list_cliente, cliente.getCad_Cliente());
                                                    
                                                        if (list_cliente.size() < 1) {
                                                            cliente.setCad_Cliente(false);
                                                        }

                                                    } else {
                                                        System.out.println("\n-----> Ação cancelada\n");
                                                        break;
                                                    }
                                                    break;

                                                default:
                                                    break;
                                            }

                                        } else {
                                            System.out.println(
                                                    "\n----------> Não há Cliente cadastrados, cadastre um cliente\n"); // ALERT
                                        }
                                        break;

                                    default:
                                        break;
                                }

                            }
                            break;

                            case 3:// Gerenciar Produto

                            Produto Produto = new Produto(); //Construtor do produto
                            //boolean cad_Produto = false; //Verificar se o produto está cadastrado

                            while (opcao_log_produto != 3) {

                                System.out.println("-- Sistema de logistica --");
                                System.out.println("-> Produto ");
                                System.out.println("Escolha uma opção -");
                                System.out.println("1 - Cadastrar produto");
                                System.out.println("2 - Excluir produto");
                                System.out.println("3 - Voltar");
                                System.out.print("Digite o número da sua opção: ");
                                opcao_log_produto = sc.nextInt();
                                sc.nextLine(); // Tirar enter do buffer

                                switch (opcao_log_produto) {

                                    case 1:// Cadastrar Produto

                                        clear(); // Limpar tela

                                        System.out.println("\n-- Sistema de logistica --");
                                        System.out.println("--> Cadastrando o Produto");
                                        System.out.print("Digite o nome do Produto (Descrição): ");
                                        nome_produto = sc.nextLine();
                                        System.out.print("Digite o código do Produto: ");
                                        int cod_Produto = sc.nextInt();

                                        Produto = new Produto(nome_produto, cod_Produto);
                                        Produto.setCad_Produto(true);
                                        list_produto.add(Produto);

                                        System.out.println("\n-----> O Produto, " + nome_produto + " foi criado! \n"); // ALERT
                                        break;

                                    case 2: // Excluir Produto
                                        if (Produto.getCad_Produto() == true) {
                                            System.out.println("\n \n-- Sistema de logistica --");
                                            System.out.println("--> Excluindo o Produto");
                                            System.out.println("1 - nome");
                                            System.out.println("2 - código do Produto");
                                            System.out.print(
                                                    "Escolha dentre as alternativas para selecionar o método de exclusão: ");
                                            int excluir_opc = sc.nextInt();

                                            sc.nextLine(); // Tirar enter do buffer

                                            switch (excluir_opc) {
                                                case 1:// nome
                                                    System.out.println("\nDigite um dos nome para apagar: ");

                                                    for (int i = 0; i < list_produto.size(); i++) {
                                                        System.out.println(list_produto.get(i).getNome());// Aqui vai
                                                                                                       // mostrar os cpf
                                                                                                       // para excluir o
                                                                                                       // Produto
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    String esc_nome = sc.nextLine();
                                                    System.out.print("Tem certeza? [1 - Sim, 2 - Não]: ");
                                                    int certeza = sc.nextInt();

                                                    if (certeza == 1) {
                                                        SeachDelete.apagarNome(esc_nome,list_produto, Produto.getCad_Produto());

                                                        if (list_produto.size() < 1) {
                                                            Produto.setCad_Produto(false);
                                                        }

                                                    } else {

                                                        clear(); // Limpar tela

                                                        System.out.println("\n-----> Ação cancelada\n");
                                                        break;

                                                    }
                                                    break;

                                                case 2: // código do Produto
                                                    System.out.println(
                                                            "\nDigite um dos códigos dos produto para apagar: ");

                                                    for (int i = 0; i < list_produto.size(); i++) {
                                                        System.out.println(list_produto.get(i).getCodigo());// Aq
                                                                                                              // vai
                                                                                                              // mostrar
                                                                                                              // os
                                                                                                              // cpf
                                                                                                              // para
                                                                                                              // excluir
                                                                                                              // o
                                                                                                              // Produto
                                                    }
                                                    System.out.print("\nDigite sua escolha:");
                                                    int esc_Produto = sc.nextInt();

                                                    System.out.print("Tem certeza? 1 - Sim, 2 - Não: ");
                                                    int certeza2 = sc.nextInt();

                                                    if (certeza2 == 1) {
                                                        SeachDelete.apagarCodigoProduto(esc_Produto,
                                                                list_produto, Produto.getCad_Produto());


                                                        if (list_produto.size() < 1) {
                                                            Produto.setCad_Produto(false);
                                                        }

                                                    } else {
                                                        System.out.println("\n-----> Ação cancelada\n");
                                                        break;
                                                    }
                                                    break;

                                                default:
                                                    break;
                                            }

                                        } else {
                                            System.out.println(
                                                    "\n----------> Não há Produto cadastrados, cadastre um Produto\n"); // ALERT
                                        }
                                        break;

                                    default:
                                        break;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    break;

                
                
                
                
                case 2:// Sistema de Controle

                    break;

                
                
                
                
                
                
                case 3: // Sistema de atualização de dados

                    break;

                
                
                
                
                
                case 4: // Sistema de transação

                    break;

                
                
                
                
                
                case 5: // Relatório

                    break;

                
                
                
                
                
                case 6: // Saída
                    System.out.println("Obrigado por utilizar de nossos serviços, espero de ver novamente! :) ");
                    System.out.println("----------------------------------------------------------------");
                    break;

                default:
                    System.out.println("\n-----> opção inválida, tente novamente.\n "); //ALERT
                    break;
            }
        }
        sc.close();

    }

    public static void clearScreen() { // Método para limpar a tela
        char esc = 27;
        String clear = esc + "[2J"; // codigo ansi para limpar a tela
        System.out.print(clear);
    }

    public static void clear() throws IOException, InterruptedException { // Método 2 para limpar a tela
        // Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    }
}