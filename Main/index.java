import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class index {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_ITALIC = "\u001B[3m";

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        // sandbox de variáveis
        int opcao = 0;
        String nome_fornecedor = "";
        String nome_cliente = "";
        String nome_produto = "";
        ArrayList<Fornecedores> list_forn = new ArrayList<Fornecedores>();
        ArrayList<Cliente> list_cliente = new ArrayList<Cliente>();
        ArrayList<Produto> list_produto = new ArrayList<Produto>();
        ArrayList<Empresa> list_empresa = new ArrayList<Empresa>();
        ArrayList<String> nome_itens_comprados = new ArrayList<String>();
        ArrayList<Integer> quantidade_itens_comprados = new ArrayList<Integer>();
        // Fim

        clear(); // Limpar a tela

        System.out.println("--------------------------------------");
        System.out.println("\n----> Seja bem vindo a Logistica e CIA :)"); // belo trabalho

        while (opcao != 4) {

            // clear();

            System.out.println("\n \n-- Menu Principal --");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Sistema de logistica - Gerenciar fornecedores/cliente/produtos");
            System.out.println("2 - Sistema de transação - Compra e Venda");
            System.out.println("3 - Relatório ");
            System.out.println("4 - Sair ");
            System.out.print("Digite o número da sua opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                
                case 1: // Logistica
                    int opcao_log_fornecedores = 0; // Navegação do menu principal dos fornecedores
                    int opcao_log_cliente = 0; // Navegação do menu principal dos clientes
                    int opcao_log_produto = 0; // Navegação do menu principal dos produtos

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

                            while (opcao_log_fornecedores != 4) {

                                System.out.println("-- Sistema de logistica --");
                                System.out.println("-> Fornecedores ");
                                System.out.println("Escolha uma opção -");
                                System.out.println("1 - Cadastrar fornecedor");
                                System.out.println("2 - Excluir fornecedores");
                                System.out.println("3 - Atualizar dados");
                                System.out.println("4 - Voltar");
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
                                        System.out.print("Digite o telefone do fornecedor: ");
                                        String telefone = sc.nextLine();
                                        System.out.print("Digite o código do fornecedor: ");
                                        int cod_fornecedor = sc.nextInt();

                                        forn = new Fornecedores(nome_fornecedor, cnpj, endereco, telefone,
                                                cod_fornecedor);
                                        forn.setCad_Fornecedor(true);// Variável para definir que criou ao menos um
                                                                     // fornecedor
                                        list_forn.add(forn);

                                        System.out.println(
                                                "\n-----> O fornecedor, " + forn.getNome() + " foi criado! \n"); // ALERT
                                        break;

                                    case 2: // Excluir Fornecedor
                                        if (Fornecedores.getCad_Fornecedor() == true) {
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
                                                        SeachDelete.apagarCnpj(esc_CNPJ, list_forn,
                                                                Fornecedores.getCad_Fornecedor());

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
                                                                list_forn, Fornecedores.getCad_Fornecedor());

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
                                    case 3: // Atualizar dados

                                        if (Fornecedores.getCad_Fornecedor() == true) {
                                            System.out.println("\n-- Sistema de logistica --");
                                            System.out.println("--> Atualizar dados do fornecedor");
                                            System.out.println("Digite qual dado atualizar: ");

                                            // Para melhor pesquisa, aumentamos os horizontes de pesquisa
                                            System.out.println("1 - Nome");
                                            System.out.println("2 - Endereço");
                                            System.out.println("3 - CNPJ");
                                            System.out.println("4 - Telefone");
                                            System.out.println("5 - Código do fornecedor");

                                            System.out.print("Escolha um número: ");
                                            int opc_atualizar = sc.nextInt();

                                            switch (opc_atualizar) {
                                                case 1: // Atualizar nome
                                                    System.out.println("\nDigite o nome para atualizar");
                                                    for (int i = 0; i < list_forn.size(); i++) {
                                                        System.out.println(list_forn.get(i).getNome());// Aqui vai
                                                                                                       // mostrar os
                                                                                                       // nomes
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    sc.nextLine(); // Tirar o enter do buffer
                                                    String ESC_nome = sc.nextLine();

                                                    if (SeachDelete.buscarNomeForn(ESC_nome, list_forn) > -1) {
                                                        System.out.print("Digite o novo nome: ");
                                                        forn.setNome(sc.nextLine());

                                                        System.out.println("\n-----> Nome atualizado, O novo nome é: "
                                                                + forn.getNome() + "\n"); // ALERT
                                                    } else {
                                                        System.out.println("\n-----> Nome não encontrado!\n"); // ALERT
                                                    }

                                                    break;

                                                case 2: // Atualizar endereço

                                                    for (int i = 0; i < list_forn.size(); i++) {
                                                        System.out.println(list_forn.get(i).getEndereco());// Aqui vai
                                                        // mostrar os
                                                        // Endereços
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    sc.nextLine(); // Tirar o enter do buffer
                                                    String ESC_endereco = sc.nextLine();

                                                    if (SeachDelete.buscarEnderecoForn(ESC_endereco, list_forn) > -1) {
                                                        System.out.print("Digite o novo endereço: ");
                                                        forn.setEndereco(sc.nextLine());

                                                        System.out.println(
                                                                "\n-----> Endereço atualizado, O novo endereço é: "
                                                                        + forn.getEndereco() + "\n"); // ALERT
                                                    } else {
                                                        System.out.println("\n-----> Endereço não encontrado!\n"); // ALERT
                                                    }

                                                    break;

                                                case 3: // Atualizar CNPJ

                                                    System.out.println("\nDigite o cnpj para atualizar");
                                                    for (int i = 0; i < list_forn.size(); i++) {
                                                        System.out.println(list_forn.get(i).getCnpj());// Aqui vai
                                                                                                       // mostrar os
                                                                                                       // cnpjs
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    sc.nextLine(); // Tirar o enter do buffer
                                                    String ESC_cnpj = sc.nextLine();

                                                    if (SeachDelete.buscarCnpjForn(ESC_cnpj, list_forn) > -1) {
                                                        System.out.print("Digite o novo cnpj: ");
                                                        forn.setCnpj(sc.nextLine());

                                                        System.out.println("\n-----> Cnpj atualizado, O novo cnpj é: "
                                                                + forn.getCnpj() + "\n"); // ALERT
                                                    } else {
                                                        System.out.println("\n-----> cnpj não encontrado!\n"); // ALERT
                                                    }

                                                    break;

                                                case 4: // Atualizar Telefone

                                                    System.out.println("\nDigite o telefone para atualizar");
                                                    for (int i = 0; i < list_forn.size(); i++) {
                                                        System.out.println(list_forn.get(i).getTelefone());// Aqui vai
                                                        // mostrar os
                                                        // telefones
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    sc.nextLine(); // Tirar o enter do buffer
                                                    String ESC_telefone = sc.nextLine();

                                                    if (SeachDelete.buscarTelefoneForn(ESC_telefone, list_forn) > -1) {
                                                        System.out.print("Digite o novo telefone: ");
                                                        forn.setTelefone(sc.nextLine());

                                                        System.out.println(
                                                                "\n-----> Telefone atualizado, O novo telefone é: "
                                                                        + forn.getTelefone() + "\n"); // ALERT
                                                    } else {
                                                        System.out.println("\n-----> telefone não encontrado!\n"); // ALERT
                                                    }

                                                    break;

                                                case 5: // Atualizar Código do fornecedor

                                                    System.out.println("\nDigite o código para atualizar");
                                                    for (int i = 0; i < list_forn.size(); i++) {
                                                        System.out.println(list_forn.get(i).getCod_fornecedor());// Aqui
                                                                                                                 // vai
                                                        // mostrar os
                                                        // códigos
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    // sc.nextLine(); // Tirar o enter do buffer
                                                    int ESC_codigo = sc.nextInt();

                                                    if (SeachDelete.buscarCodigoForn(ESC_codigo, list_forn) > -1) {
                                                        System.out.print("Digite o novo código: ");
                                                        forn.setCod_fornecedor(sc.nextInt());

                                                        System.out.println(
                                                                "\n-----> Código atualizado, O novo código é: "
                                                                        + forn.getCod_fornecedor() + "\n"); // ALERT
                                                    } else {
                                                        System.out.println("\n-----> código não encontrado!\n"); // ALERT
                                                    }

                                                    break;
                                                default:
                                                    break;
                                            }
                                            break;
                                        } else {
                                            System.out.println(
                                                    "\n----------> Não há fornecedores cadastrados, cadastre um forncecedor\n"); // ALERT

                                        }

                                    default:
                                        break;
                                }

                            }
                            break;

                        case 2:// Gerenciar cliente

                            Cliente cliente = new Cliente(); // Construtor do cliente

                            while (opcao_log_cliente != 4) {

                                System.out.println("-- Sistema de logistica --");
                                System.out.println("-> Cliente ");
                                System.out.println("Escolha uma opção -");
                                System.out.println("1 - Cadastrar cliente");
                                System.out.println("2 - Excluir cliente");
                                System.out.println("3 - Atualizar dados");
                                System.out.println("4 - Voltar");
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

                                        cliente = new Cliente(nome_cliente, cnpj_cpf_cliente, endereco_cliente,
                                                telefone, cod_cliente);
                                        cliente.setCadastro(true);// Variável para definir que criou ao menos um
                                                                  // cliente -- MUDEI AQ
                                        list_cliente.add(cliente);

                                        // cad_Cliente = true;

                                        System.out.println("\n-----> O cliente, " + nome_cliente + " foi criado! \n"); // ALERT
                                        break;

                                    case 2: // Excluir cliente
                                        if (Cliente.getCadastro() == true) { // MUDEI AQ
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
                                                        System.out.println(list_cliente.get(i).getCnpj_cpf());// Aqui
                                                                                                              // vai
                                                        // mostrar os cpf
                                                        // para excluir o
                                                        // cliente
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    String esc_CNPJ_CPF = sc.nextLine();
                                                    System.out.print("Tem certeza? [1 - Sim, 2 - Não]: ");
                                                    int certeza = sc.nextInt();

                                                    if (certeza == 1) {
                                                        SeachDelete.apagarCnpj_Cpf(esc_CNPJ_CPF, list_cliente,
                                                                Cliente.getCadastro());

                                                        if (list_cliente.size() < 1) {
                                                            cliente.setCadastro(false);
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
                                                        System.out.println(list_cliente.get(i).getCodigo());// Aq
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
                                                                list_cliente, Cliente.getCadastro());

                                                        if (list_cliente.size() < 1) {
                                                            cliente.setCadastro(false);
                                                        }

                                                    } else {
                                                        System.out.println("\n-----> Ação cancelada\n");
                                                        break;
                                                    }
                                                    break;

                                                // a

                                                default:
                                                    break;
                                            }

                                        } else {
                                            System.out.println(
                                                    "\n----------> Não há Cliente cadastrados, cadastre um cliente\n"); // ALERT
                                        }
                                        break;
                                    case 3: // Atualizar dados

                                        if (Cliente.getCadastro() == true) {
                                            System.out.println("\n-- Sistema de logistica --");
                                            System.out.println("--> Atualizar dados do cliente");
                                            System.out.println("Digite qual dado atualizar: ");

                                            // Para melhor pesquisa, aumentamos os horizontes de pesquisa
                                            System.out.println("1 - Nome");
                                            System.out.println("2 - Endereço");
                                            System.out.println("3 - CNPJ");
                                            System.out.println("4 - Telefone");
                                            System.out.println("5 - Código do cliente");

                                            System.out.print("Escolha um número: ");
                                            int opc_atualizar = sc.nextInt();

                                            switch (opc_atualizar) {
                                                case 1: // Atualizar nome
                                                    System.out.println("\nDigite uma das opções abaixo para atualizar o nome: ");
                                                    for (int i = 0; i < list_cliente.size(); i++) {
                                                        System.out.println(list_cliente.get(i).getNome());// Aqui vai
                                                                                                          // mostrar os
                                                                                                          // nomes
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    sc.nextLine(); // Tirar o enter do buffer
                                                    String ESC_nome = sc.nextLine();

                                                    if (SeachDelete.buscarNomeCliente(ESC_nome, list_cliente) > -1) {
                                                        System.out.print("Digite o novo nome: ");
                                                        cliente.setNome(sc.nextLine());

                                                        System.out.println("\n-----> Nome atualizado, O novo nome é: "
                                                                + cliente.getNome() + "\n"); // ALERT
                                                    } else {
                                                        System.out.println("\n-----> Nome não encontrado!\n"); // ALERT
                                                    }

                                                    break;

                                                case 2: // Atualizar endereço

                                                    for (int i = 0; i < list_cliente.size(); i++) {
                                                        System.out.println(list_cliente.get(i).getEndereco());// Aqui
                                                                                                              // vai
                                                        // mostrar os
                                                        // Endereços
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    sc.nextLine(); // Tirar o enter do buffer
                                                    String ESC_endereco = sc.nextLine();

                                                    if (SeachDelete.buscarEnderecoCliente(ESC_endereco,
                                                            list_cliente) > -1) {
                                                        System.out.print("Digite o novo endereço: ");
                                                        cliente.setEndereco(sc.nextLine());

                                                        System.out.println(
                                                                "\n-----> Endereço atualizado, O novo endereço é: "
                                                                        + cliente.getEndereco() + "\n"); // ALERT
                                                    } else {
                                                        System.out.println("\n-----> Endereço não encontrado!\n"); // ALERT
                                                    }

                                                    break;

                                                case 3: // Atualizar CNPJ

                                                    System.out.println("\nDigite o cnpj para atualizar");
                                                    for (int i = 0; i < list_cliente.size(); i++) {
                                                        System.out.println(list_cliente.get(i).getCnpj_cpf());// Aqui
                                                                                                              // vai
                                                        // mostrar os
                                                        // cnpjs
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    sc.nextLine(); // Tirar o enter do buffer
                                                    String ESC_cnpj = sc.nextLine();

                                                    if (SeachDelete.buscarCnpjCliente(ESC_cnpj, list_cliente) > -1) {
                                                        System.out.print("Digite o novo cnpj: ");
                                                        cliente.setCnpj_cpf(sc.nextLine());

                                                        System.out.println("\n-----> Cnpj atualizado, O novo cnpj é: "
                                                                + cliente.getCnpj_cpf() + "\n"); // ALERT
                                                    } else {
                                                        System.out.println("\n-----> cnpj não encontrado!\n"); // ALERT
                                                    }

                                                    break;

                                                case 4: // Atualizar Telefone

                                                    System.out.println("\nDigite o telefone para atualizar");
                                                    for (int i = 0; i < list_cliente.size(); i++) {
                                                        System.out.println(list_cliente.get(i).getTelefone());// Aqui
                                                                                                              // vai
                                                        // mostrar os
                                                        // telefones
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    sc.nextLine(); // Tirar o enter do buffer
                                                    String ESC_telefone = sc.nextLine();

                                                    if (SeachDelete.buscarTelefoneCliente(ESC_telefone,
                                                            list_cliente) > -1) {
                                                        System.out.print("Digite o novo telefone: ");
                                                        cliente.setTelefone(sc.nextLine());

                                                        System.out.println(
                                                                "\n-----> Telefone atualizado, O novo telefone é: "
                                                                        + cliente.getTelefone() + "\n"); // ALERT
                                                    } else {
                                                        System.out.println("\n-----> telefone não encontrado!\n"); // ALERT
                                                    }

                                                    break;

                                                case 5: // Atualizar Código do cliente

                                                    System.out.println("\nDigite o código para atualizar");
                                                    for (int i = 0; i < list_cliente.size(); i++) {
                                                        System.out.println(list_cliente.get(i).getCodigo());// Aqui vai
                                                        // mostrar os
                                                        // códigos
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    // sc.nextLine(); // Tirar o enter do buffer
                                                    int ESC_codigo = sc.nextInt();

                                                    if (SeachDelete.buscarCodigoCliente(ESC_codigo,
                                                            list_cliente) > -1) {
                                                        System.out.print("Digite o novo código: ");
                                                        cliente.setCodigo(sc.nextInt());

                                                        System.out.println(
                                                                "\n-----> Código atualizado, O novo código é: "
                                                                        + cliente.getCodigo() + "\n"); // ALERT
                                                    } else {
                                                        System.out.println("\n-----> código não encontrado!\n"); // ALERT
                                                    }

                                                    break;
                                                default:
                                                    break;
                                            }
                                            break;
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

                        case 3:// Gerenciar Produto

                            Produto Produto = new Produto(); // Construtor do produto

                            while (opcao_log_produto != 4) {

                                System.out.println("-- Sistema de logistica --");
                                System.out.println("-> Produto ");

                                System.out.println("\n" + ANSI_RED
                                        + "Atenção! Todo produto criado pertençe ao fornecedor" + ANSI_RESET + "\n");

                                System.out.println("Escolha uma opção -");
                                System.out.println("1 - Cadastrar produto");
                                System.out.println("2 - Excluir produto");
                                System.out.println("3 - Atualizar dados");
                                System.out.println("4 - Voltar");
                                System.out.print("Digite o número da sua opção: ");
                                opcao_log_produto = sc.nextInt();
                                sc.nextLine(); // Tirar enter do buffer

                                switch (opcao_log_produto) {

                                    case 1:// Cadastrar Produto TODO PRODUTO CADASTRADO É DO FORNECEDOR

                                        clear(); // Limpar tela

                                        System.out.println("\n-- Sistema de logistica --");
                                        System.out.println("--> Cadastrando o Produto");
                                        System.out.print("Digite o nome do Produto: ");
                                        nome_produto = sc.nextLine();
                                        System.out.print("Digite a quantidade desse produto: ");
                                        int quantidade_produto = sc.nextInt();
                                        System.out.print("Digite o preço desse produto: ");
                                        double preco_produto = sc.nextDouble();
                                        System.out.print("Digite o código do Produto: ");
                                        int cod_Produto = sc.nextInt();

                                        Produto = new Produto(nome_produto, quantidade_produto, cod_Produto,
                                                preco_produto);
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
                                                                                                          // mostrar os
                                                                                                          // cpf
                                                                                                          // para
                                                                                                          // excluir o
                                                                                                          // Produto
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    String esc_nome = sc.nextLine();
                                                    System.out.print("Tem certeza? [1 - Sim, 2 - Não]: ");
                                                    int certeza = sc.nextInt();

                                                    if (certeza == 1) {
                                                        SeachDelete.apagarNomeProduto(esc_nome, list_produto,
                                                                Produto.getCad_Produto());

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

                                    case 3: // Atualizar dados

                                        if (Produto.getCad_Produto() == true) {
                                            System.out.println("\n-- Sistema de logistica --");
                                            System.out.println("--> Atualizar dados do produto");
                                            System.out.println("Digite qual dado atualizar: ");

                                            // Para melhor pesquisa, aumentamos os horizontes de pesquisa
                                            System.out.println("1 - Nome");
                                            System.out.println("2 - Código do produto");

                                            System.out.print("Escolha um número: ");
                                            int opc_atualizar = sc.nextInt();

                                            switch (opc_atualizar) {
                                                case 1: // Atualizar nome
                                                    System.out.println("\nDigite o nome do produto para atualizar");
                                                    for (int i = 0; i < list_produto.size(); i++) {
                                                        System.out.println(list_produto.get(i).getNome());// Aqui vai
                                                                                                          // mostrar os
                                                                                                          // nomes
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    sc.nextLine(); // Tirar o enter do buffer
                                                    String ESC_nome = sc.nextLine();

                                                    if (SeachDelete.buscarNomeProduto(ESC_nome, list_produto) > -1) {
                                                        System.out.print("Digite o novo nome: ");
                                                        Produto.setNome(sc.nextLine());

                                                        System.out.println("\n-----> Nome atualizado, O novo nome é: "
                                                                + Produto.getNome() + "\n"); // ALERT
                                                    } else {
                                                        System.out.println("\n-----> Nome não encontrado!\n"); // ALERT
                                                    }

                                                    break;

                                                case 2: // Atualizar Código do produto

                                                    System.out.println("\nDigite o código para atualizar");
                                                    for (int i = 0; i < list_produto.size(); i++) {
                                                        System.out.println(list_produto.get(i).getCodigo());// Aqui vai
                                                        // mostrar os
                                                        // códigos
                                                    }

                                                    System.out.print("\nDigite sua escolha:");
                                                    int ESC_codigo = sc.nextInt();

                                                    if (SeachDelete.buscarCodigoProduto(ESC_codigo,
                                                            list_produto) > -1) {
                                                        System.out.print("Digite o novo código: ");
                                                        Produto.setCodigo(sc.nextInt());

                                                        System.out.println(
                                                                "\n-----> Código atualizado, O novo código é: "
                                                                        + Produto.getCodigo() + "\n"); // ALERT
                                                    } else {
                                                        System.out.println("\n-----> código não encontrado!\n"); // ALERT
                                                    }

                                                    break;

                                                default:
                                                    break;
                                            }
                                        }
                                        break;

                                }
                            }
                            break;

                        default:
                            break;
                    }
                    break;

                case 2: // Sistema de transação
                    Empresa empresa = new Empresa();

                    clear();
                    if (list_produto.size() > 0) { // Verifica se há produtos cadastrados para o fornecedor

                        System.out.println("-- Sistema de transação --");
                        System.out.println("--> Primeiro, queremos saber quem é você!");
                        System.out.println("1- Empresa (Comprar do fornecedor - Vender para os clientes) ");
                        System.out.println("2 - Cliente (Comprar da empresa)");

                        System.out.print("Digite o número da sua opção: ");
                        int opcao_transacao = sc.nextInt();

                        int opc_produto = 0;
                        int opc_cliente = 0;
                        Produto produto = new Produto();

                        boolean isEmpresa;
                        switch (opcao_transacao) {
                            case 1: // Empresa comprando do fornecedor
                                isEmpresa = true;
                                while (opc_produto > -1) {
                                    System.out.println("\n-- Sistema de transação --");
                                    System.out.println("--> Empresa");

                                    Produto.exibirDados(list_produto);

                                    System.out.println(ANSI_BOLD
                                            + "-----> Digite um número negativo para finalizar a compra" + ANSI_RESET);

                                    System.out.print("\nDigite o código do produto desejado para comprar: ");
                                    opc_produto = sc.nextInt();

                                    if (SeachDelete.buscarCodigoProduto(opc_produto, list_produto) > -1) { // Busca e verifica se a localização do código digitado tem na lista
                                        System.out.print("Digite a quantidade do produto desejado para comprar: ");
                                        int quantidade = sc.nextInt();


                                        int posicao = SeachDelete.buscarCodigoProduto(opc_produto, list_produto); // Diz em qual posição está o código procurado
                                        int quantidade_produtos_empresa = list_produto.get(posicao).getQuantidade_produto();
                                        int resto_produtos_empresa = quantidade_produtos_empresa - quantidade;
                                        
                                        
                                        if (resto_produtos_empresa >= 0) { // Verifica se há a quantidade digitada disponivel no array
                                            
                                            
                                            String nome = list_produto.get(SeachDelete.buscarCodigoProduto(opc_produto, list_produto)).getNome(); // Diz o nome do produto a partir do código do produto
                                            double preco = list_produto.get(SeachDelete.buscarCodigoProduto(opc_produto, list_produto)).getPreco_produto(); // Diz o preço do produto a partir do código do produto

                                            empresa = new Empresa(nome, quantidade, preco, opc_produto, isEmpresa); // Coloca o nome, quantidade comprada e o preço no contrutor de quem está comprando (a empresa)
                                            list_empresa.add(empresa); // Adiciona na lista de construtores da empresa

                                            //Criar um array com o nome dos itens comprados, e a quantidade dos mesmos
                                            nome_itens_comprados.add(nome);
                                            quantidade_itens_comprados.add(quantidade);

                                            SeachDelete.apagarQuantidadeProduto(quantidade, posicao, list_produto); // Chama o método para apagar o construtor

                                            System.out.println("\n-----> Você comprou: " + empresa.getNome()
                                                    + ", unidade(s): " + empresa.getQuantidade() + " e gastou: R$"
                                                    + empresa.getPreco());

                                            System.out.println(
                                                    "-----> Você gastou R$" + Produto.getValor_total_empresa() + " no total\n");

                                        } else {
                                            System.out.println(
                                                    "\n-----> Não há essa quantidade de produtos, digite um número menor do que a quantidade desse produto!\n"); // ALERT
                                        }
                                    } else {
                                        System.out.println("\n-----> Produto não encontrado\n"); // ALERT
                                    }
                                }
                                break;
                            
                            case 2: // Cliente comprando da empresa

                                isEmpresa = false;
                                while (opc_cliente > -1) {
                                    System.out.println("\n-- Sistema de transação --");
                                    System.out.println("--> Cliente");

                                    Empresa.exibirDados(list_empresa);

                                    System.out.println(ANSI_BOLD
                                            + "-----> Digite um número negativo para finalizar a compra" + ANSI_RESET);

                                    System.out.print("Digite o código do produto desejado para comprar: ");
                                    opc_cliente = sc.nextInt();

                                    if (SeachDelete.buscarCodigoEmpresa(opc_cliente, list_empresa) > -1) { // Busca e verifica se a localização do código digitado tem na lista
                                        System.out.print("Digite a quantidade do produto desejado para comprar: ");
                                        int quantidade = sc.nextInt();
                                        // produto = new Produto(quantidade, opc_cliente);


                                        int posicao = SeachDelete.buscarCodigoEmpresa(opc_cliente, list_empresa); // Diz em qual posição está o código procurado
                                        
                                        

                                        int quantidade_produtos_empresa = list_empresa.get(posicao).getQuantidade();
                                        int resto_produtos_empresa = quantidade_produtos_empresa - quantidade;
                                        if (resto_produtos_empresa >= 0) { // Verifica se há a quantidade digitada disponivel no array
                                            String nome = list_empresa.get(SeachDelete.buscarCodigoEmpresa(opc_cliente, list_empresa)).getNome(); // Diz o nome do produto a partir do código do produto
                                            double preco = list_empresa.get(SeachDelete.buscarCodigoEmpresa(opc_cliente, list_empresa)).getPreco(); // Diz o preço do produto a partir do código do produto

                                            empresa = new Empresa(nome, quantidade, preco, opc_cliente, isEmpresa); // Coloca o nome, quantidade comprada e o preço no contrutor de quem tá comprando (a empresa)
                                            list_empresa.add(empresa); // Adiciona na lista de construtores da empresa
                                            SeachDelete.apagarQuantidadeEmpresa(quantidade, posicao, list_empresa); // Chama o método para apagar o construtor

                                            System.out.println("\n-----> Você comprou: " + empresa.getNome() + ", unidade(s): " + empresa.getQuantidade() + " e gastou: R$" + empresa.getPreco());

                                            System.out.println("-----> Você gastou R$" + Produto.getValor_total_cliente() + " no total\n");

                                        } else {
                                            System.out.println(
                                                    "\n-----> Não há essa quantidade de produtos, digite um número menor do que a quantidade desse produto!\n"); // ALERT
                                        }
                                    } else {
                                        System.out.println("\n-----> Produto não encontrado\n"); // ALERT
                                    }

                                }

                                break;

                            default:
                                System.out.println("\n-----> Opção Inválida\n"); // ALERT
                                break;

                        }
                    } else {
                        System.out.println(ANSI_RED
                                + "\n-----> Não há produtos cadastrados, por favor, tente mais tarde;" + ANSI_RESET); // ALERT
                        System.out.println(ANSI_ITALIC
                                + "-----> Caso seja um fornecedor, considere cadastrar seus produtos" + ANSI_RESET
                                + "\n"); // ALERT
                    }

                    break;

                case 3: // Relatório
                    clear();

                    System.out.println("\n-- Relatório --");
                    System.out.println("--> Olá! Veja o relatório, nele contém: ");
                    System.out.println("// Quantidade de fornecedores e clientes;");
                    System.out.println("// Valor total das compras;");
                    System.out.println("// Os 10 produtos mais vendidos \n");

                    System.out.println("- Há no total, " + Fornecedores.total_fornecedores
                            + " fornecedor(es) atualmente cadastrados, que é(são): ");
                    Fornecedores.exibirDados(list_forn); // Mostra os dados dos fornecedores
                    sleep(2); // Espera 2 segundos antes de continuar

                    System.out.println("- Há no total, " + Cliente.total_cliente + " cliente(es) atualmente cadastrados, que é(são): ");
                    Cliente.exibirDados(list_cliente); // Mostra os dados dos fornecedores
                    sleep(2); // Espera 2 segundos antes de continuar

                    System.out.println("\n- Valor total das compras da empresa é de: " + Produto.getValor_total_empresa());
                    System.out.println("- Valor total das compras do cliente é de: " + Produto.getValor_total_cliente());

                    Double valor_tot_empresa_cliente = Produto.getValor_total_empresa() + Produto.getValor_total_cliente();
                    System.out.println("- Valor total das compras do cliente e da empresa é de: " + valor_tot_empresa_cliente);

                    System.out.println("\n- Os 10 produtos mais vendidos são: ");
                    Produto.top10(Produto.quantidade, Produto.opc_cliente, list_produto);  //aq

                    break;

                case 4: // Saída
                    System.out
                            .println("\n-----> Obrigado por utilizar de nossos serviços, espero te ver novamente! :) "); // ALERT
                    System.out.println("----------------------------------------------------------------\n");
                    break;

                default:
                    System.out.println("\n-----> opção inválida, tente novamente.\n "); // ALERT
                    break;
            }
        }
        sc.close();

    }

    public static void clear() throws IOException, InterruptedException { // Método 2 para limpar a tela
        // Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    }

    public static void sleep(int segundos) throws IOException, InterruptedException {
        segundos *= 1000;// Transformar milisegundos em segundos
        Thread.sleep(segundos);
    }

}