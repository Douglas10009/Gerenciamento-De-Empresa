import java.util.ArrayList;

public class SeachDelete {
	public static int buscarCnpj(int cnpj, ArrayList<Fornecedores> list_forn) {
		for (int i = 0; i < list_forn.size(); i++) {
			if (list_forn.get(i).getCnpj() == cnpj) {
				System.out.println("Posição do CNPJ para excluir: " + i);
				return i;
			}
		}
		return -1;
	}

	public static void apagarCnpj(int cnpj, ArrayList<Fornecedores> list_forn, boolean cad_Fornecedor) {
		int posicao = buscarCnpj(cnpj, list_forn);

		if (posicao != -1) {
			list_forn.remove(posicao);
			System.out.println("\n-----> Fornecedor com o CNPJ " + cnpj + " foi apagado com sucesso. \n"); // ALERT
			if (list_forn.size() < 1) {
				cad_Fornecedor = false;
			}

		} else {
			System.out.println("\n-----> CNPJ Não encontrado\n"); // ALERT
		}

	}

	public static int buscarCodigoFornecedor(int cod_fornecedor, ArrayList<Fornecedores> list_forn) {
		for (int i = 0; i < list_forn.size(); i++) {
			if (list_forn.get(i).getCod_fornecedor() == cod_fornecedor) {
				System.out.println("Posição do código do fornecedor para excluir: " + i);
				return i;
			}
		}
		return -1;
	}

	public static void apagarCodigoFornecedor(int cod_fornecedor, ArrayList<Fornecedores> list_forn,
			boolean cad_Fornecedor) {
		int posicao = buscarCodigoFornecedor(cod_fornecedor, list_forn);

		if (posicao != -1) {
			list_forn.remove(posicao);
			System.out.println("\n-----> Fornecedor com o código " + cod_fornecedor + " foi apagado com sucesso. \n"); // ALERT
			if (list_forn.size() < 1) {
				cad_Fornecedor = false;
			}

		} else {
			System.out.println("\n-----> Código do fornecedor não encontrado\n"); // ALERT
		}

	}
}
