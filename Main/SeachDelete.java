import java.util.ArrayList;

public class SeachDelete /*extends Cliente - ERROR - cadastro do cliente, boolean*/{

	static Fornecedores fornecedor = new Fornecedores(); //- ERROR - cadastro do cliente, boolean

	//Fornecedor
	public static int buscarCnpj(String cnpj, ArrayList<Fornecedores> list_forn) {
		for (int i = 0; i < list_forn.size(); i++) {
			if (list_forn.get(i).getCnpj().equals(cnpj)) {
				return i;
			}
		}
		return -1;
	}

	public static void apagarCnpj(String cnpj, ArrayList<Fornecedores> list_forn, boolean cad_Fornecedor) {
		int posicao = buscarCnpj(cnpj, list_forn);

		if (posicao != -1) {
			System.out.println("\n-----> Fornecedor, " + list_forn.get(posicao).getNome() + ", com o CNPJ " + cnpj + " foi apagado com sucesso. \n"); // ALERT
			list_forn.remove(posicao);

			if (list_forn.size() < 1) {
				fornecedor.setCad_Fornecedor(false); 
			}

		} else {
			System.out.println("\n-----> CNPJ Não encontrado\n"); // ALERT
		}

	}

	public static int buscarCodigoFornecedor(int cod_fornecedor, ArrayList<Fornecedores> list_forn) {
		for (int i = 0; i < list_forn.size(); i++) {
			if (list_forn.get(i).getCod_fornecedor() == cod_fornecedor) {
				return i;
			}
		}
		return -1;
	}

	public static void apagarCodigoFornecedor(int cod_fornecedor, ArrayList<Fornecedores> list_forn,
			boolean cad_Fornecedor) {
		int posicao = buscarCodigoFornecedor(cod_fornecedor, list_forn);

		if (posicao != -1) {
			System.out.println("\n-----> Fornecedor, " + list_forn.get(posicao).getNome() + ", com o código " + cod_fornecedor + " foi apagado com sucesso. \n"); // ALERT
			list_forn.remove(posicao);

			if (list_forn.size() < 1) {
				fornecedor.setCad_Fornecedor(false); //ERROR - cadastro do fornecedor, boolean
				//cad_Fornecedor = false;
			}

		} else {
			System.out.println("\n-----> Código do fornecedor não encontrado\n"); // ALERT
		}

	}

	public static int buscarNomeForn(String nome, ArrayList<Fornecedores> list_forn) {
		for (int i = 0; i < list_forn.size(); i++) {
			if (list_forn.get(i).getNome().equals(nome)) {
				return i; //Retorna uma posição no array
			}
		}
		return -1;
	}

	public static int buscarEnderecoForn(String endereco, ArrayList<Fornecedores> list_forn) {
		for (int i = 0; i < list_forn.size(); i++) {
			if (list_forn.get(i).getEndereco().equals(endereco)) {
				return i; //Retorna uma posição no array
			}
		}
		return -1;
	}

	public static int buscarCnpjForn(String cnpj, ArrayList<Fornecedores> list_forn) {
		for (int i = 0; i < list_forn.size(); i++) {
			if (list_forn.get(i).getCnpj().equals(cnpj)) {
				return i; //Retorna uma posição no array
			}
		}
		return -1;
	}

	public static int buscarTelefoneForn(String telefone, ArrayList<Fornecedores> list_forn) {
		for (int i = 0; i < list_forn.size(); i++) {
			if (list_forn.get(i).getTelefone().equals(telefone)) {
				return i; //Retorna uma posição no array
			}
		}
		return -1;
	}

	public static int buscarCodigoForn(int codigo, ArrayList<Fornecedores> list_forn) {
		for (int i = 0; i < list_forn.size(); i++) {
			if (list_forn.get(i).getCod_fornecedor() == codigo) {
				return i; //Retorna uma posição no array
			}
		}
		return -1;
	}






	//Cliente
	public static int buscarCnpj_Cpf(String cnpj_cpf, ArrayList<Cliente> list_cliente) {
		for (int i = 0; i < list_cliente.size(); i++) {
			if (list_cliente.get(i).getCnpj_cpf().equals(cnpj_cpf)) {
				return i;
			}
		}
		return -1;
	}

	public static void apagarCnpj_Cpf(String cnpj_cpf, ArrayList<Cliente> list_cliente, boolean cad_Cliente) {
		int posicao = buscarCnpj_Cpf(cnpj_cpf, list_cliente);

		if (posicao != -1) {
			System.out.println("\n-----> Cliente, " + list_cliente.get(posicao).getNome() + ", com o CNPJ/CPF " + cnpj_cpf + " foi apagado com sucesso. \n"); // ALERT
			list_cliente.remove(posicao);

			if (list_cliente.size() < 1) {
				cad_Cliente = false;
			}			
		} else {
			System.out.println("\n-----> CNPJ/CPF Não encontrado\n"); // ALERT
		}

	}

	public static int buscarCodigoCliente(int cod_cliente, ArrayList<Cliente> list_cliente) {
		for (int i = 0; i < list_cliente.size(); i++) {
			if (list_cliente.get(i).getCodigo() == cod_cliente) {
				return i;
			}
		}
		return -1;
	}

	public static void apagarCodigoCliente(int cod_cliente, ArrayList<Cliente> list_cliente,
			boolean cad_Cliente) {
		int posicao = buscarCodigoCliente(cod_cliente, list_cliente);

		if (posicao != -1) {
			System.out.println("\n-----> Cliente, " + list_cliente.get(posicao).getNome() + ", com o código " + cod_cliente + " foi apagado com sucesso. \n"); // ALERT
			list_cliente.remove(posicao);

			if (list_cliente.size() < 1) {
				cad_Cliente = false;
			}

		} else {
			System.out.println("\n-----> Código do cliente não encontrado\n"); // ALERT
		}

	}

	public static int buscarNomeCliente(String nome, ArrayList<Cliente> list_cliente) {
		for (int i = 0; i < list_cliente.size(); i++) {
			if (list_cliente.get(i).getNome().equals(nome)) {
				return i; //Retorna uma posição no array
			}
		}
		return -1;
	}

	public static int buscarEnderecoCliente(String endereco, ArrayList<Cliente> list_cliente) {
		for (int i = 0; i < list_cliente.size(); i++) {
			if (list_cliente.get(i).getEndereco().equals(endereco)) {
				return i; //Retorna uma posição no array
			}
		}
		return -1;
	}

	public static int buscarCnpjCliente(String cnpj, ArrayList<Cliente> list_cliente) {
		for (int i = 0; i < list_cliente.size(); i++) {
			if (list_cliente.get(i).getCnpj_cpf().equals(cnpj)) {
				return i; //Retorna uma posição no array
			}
		}
		return -1;
	}

	public static int buscarTelefoneCliente(String telefone, ArrayList<Cliente> list_cliente) {
		for (int i = 0; i < list_cliente.size(); i++) {
			if (list_cliente.get(i).getTelefone().equals(telefone)) {
				return i; //Retorna uma posição no array
			}
		}
		return -1;
	}






	//Produtos
	public static int buscarNomeProduto(String nome, ArrayList<Produto> list_produto) {
		for (int i = 0; i < list_produto.size(); i++) {
			if (list_produto.get(i).getNome().equals(nome)) {
				return i;
			}
		}
		return -1;
	}

	public static void apagarNomeProduto(String nome, ArrayList<Produto> list_produto, boolean cad_Produto) {
		int posicao = buscarNomeProduto(nome, list_produto);

		if (posicao != -1) {
			System.out.println("\n-----> O Produto " + nome + " foi apagado com sucesso. \n"); // ALERT
			list_produto.remove(posicao);

			if (list_produto.size() < 1) {
				cad_Produto = false;
			}			
		} else {
			System.out.println("\n-----> Nome não encontrado\n"); // ALERT
		}

	}

	public static int buscarCodigoProduto(int cod_produto, ArrayList<Produto> list_produto) {
		for (int i = 0; i < list_produto.size(); i++) {
			if (list_produto.get(i).getCodigo() == cod_produto) {
				return i;
			}
		}
		return -1;
	}

	public static void apagarCodigoProduto(int cod_produto, ArrayList<Produto> list_produto,
			boolean cad_Produto) {
		int posicao = buscarCodigoProduto(cod_produto, list_produto);

		if (posicao != -1) {
			System.out.println("\n-----> O produto," + list_produto.get(posicao).getNome() + ", com o código " + cod_produto + " foi apagado com sucesso. \n"); // ALERT
			list_produto.remove(posicao);

			if (list_produto.size() < 1) {
				cad_Produto = false;
			}

		} else {
			System.out.println("\n-----> Código do produto não encontrado\n"); // ALERT
		}
        

	}
}
