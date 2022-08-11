import java.util.ArrayList;

public class SeachDelete {

	//Fornecedor
	public static int buscarCnpj(String cnpj, ArrayList<Fornecedores> list_forn) {
		for (int i = 0; i < list_forn.size(); i++) {
			if (list_forn.get(i).getCnpj().equals(cnpj)) {
				//System.out.println("Posição do CNPJ para excluir: " + i); //DEBUG - Erro na lista fornecedores
				return i;
			}
		}
		return -1;
	}

	public static void apagarCnpj(String cnpj, ArrayList<Fornecedores> list_forn, boolean cad_Fornecedor) {
		int posicao = buscarCnpj(cnpj, list_forn);

		if (posicao != -1) {
			System.out.println("\n-----> Fornecedor, " + list_forn.get(posicao).getNome() + ", com o CNPJ " + cnpj + " foi apagado com sucesso. \n"); // ALERT
			

			// System.out.println(list_forn.size()); //DEBUG - Erro na lista fornecedores
			// System.out.println(cad_Fornecedor); //DEBUG - Erro na lista fornecedores

			list_forn.remove(posicao);

			if (list_forn.size() < 1) {
				cad_Fornecedor = false;
			}


			// System.out.println(list_forn.size()); //DEBUG - Erro na lista fornecedores
			// System.out.println(cad_Fornecedor); //DEBUG - Erro na lista fornecedores

			
			
		} else {
			System.out.println("\n-----> CNPJ Não encontrado\n"); // ALERT
		}

	}

	public static int buscarCodigoFornecedor(int cod_fornecedor, ArrayList<Fornecedores> list_forn) {
		for (int i = 0; i < list_forn.size(); i++) {
			if (list_forn.get(i).getCod_fornecedor() == cod_fornecedor) {
				//System.out.println("Posição do código do fornecedor para excluir: " + i); DEBUG
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
				cad_Fornecedor = false;
			}

		} else {
			System.out.println("\n-----> Código do fornecedor não encontrado\n"); // ALERT
		}

	}




	//Cliente
	public static int buscarCnpj_Cpf(String cnpj_cpf, ArrayList<Cliente> list_cliente) {
		for (int i = 0; i < list_cliente.size(); i++) {
			if (list_cliente.get(i).getCnpj().equals(cnpj_cpf)) {
				return i;
			}
		}
		return -1;
	}

	public static void apagarCnpj_Cpf(String cnpj_cpf, ArrayList<Cliente> list_cliente, boolean cod_Cliente) {
		int posicao = buscarCnpj_Cpf(cnpj_cpf, list_cliente);

		if (posicao != -1) {
			System.out.println("\n-----> Cliente, " + list_cliente.get(posicao).getNome() + ", com o CNPJ/CPF " + cnpj_cpf + " foi apagado com sucesso. \n"); // ALERT
			list_cliente.remove(posicao);

			if (list_cliente.size() < 1) {
				cod_Cliente = false;
			}			
		} else {
			System.out.println("\n-----> CNPJ/CPF Não encontrado\n"); // ALERT
		}

	}

	public static int buscarCodigoCliente(int cod_cliente, ArrayList<Cliente> list_cliente) {
		for (int i = 0; i < list_cliente.size(); i++) {
			if (list_cliente.get(i).getCod_cliente() == cod_cliente) {
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
}
