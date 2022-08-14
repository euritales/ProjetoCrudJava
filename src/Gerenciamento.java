import conexao.BancoDeDados;
import model.Produto;

public class Gerenciamento {
	
	
	public static void main(String[] args) {
//	
		BancoDeDados sintaxeBanco = new BancoDeDados();
		sintaxeBanco.Conectar();
	

		// Essa etapa abaixo pode ser feita com a interface, e casa bem com os modelos atuais.
		Produto produto = new Produto();
		produto.setIdProduto(12);
		produto.setNomeProduto("Pneu");
		produto.setPreco(397.40);
		produto.setQtdProduto(16);
		produto.setTipoGenerico(false);
		produto.setTipoMedicamento(false);
		
		Produto produto2 = new Produto();
		
		produto.setIdProduto(15);
		produto.setNomeProduto("Shampoo");
		produto.setPreco(28.40);
		produto.setQtdProduto(26);
		produto.setTipoGenerico(false);
		produto.setTipoMedicamento(false);
		
		if(sintaxeBanco.estaConectado()) {
			// insercao
			sintaxeBanco.InserirProdutos(produto);
			//edicao
			sintaxeBanco.ModificarProduto(produto2);
			// Exclusao
			sintaxeBanco.ExcluirProduto(produto);
			for(Produto p: sintaxeBanco.getProdutos()) {
				System.out.println("\nID: " + p.getIdProduto());
				System.out.println("Produto: " + p.getNomeProduto());
				System.out.println("Quantidade: " + p.getQtdProduto());
				System.out.println("Preco: " + p.getPreco());
			}
			System.out.println("Exito");
		}else {
			System.out.println("Falha na operacao");
		}

	}

}
