package controller;
import conexao.BancoDeDados;
import model.Produto;

public class Gerenciamento {
	
	
	public static void main(String[] args) {
//	
		BancoDeDados sintaxeBanco = new BancoDeDados();
		sintaxeBanco.Conectar();

		Produto produto = new Produto();
		produto.setId_produto(14);
		produto.setNome_produto("Buscopam");
		produto.setPreco(15.75);
		produto.setQtd_produto(12);
		produto.setTipo_generico(false);
		produto.setTipo_medicamento(true);
		
//		Produto produto2 = new Produto();
//		produto.setId_produto(15);
//		produto.setNome_produto("Shampoo");
//		produto.setPreco(28.40);
//		produto.setQtd_produto(26);
//		produto.setTipo_generico(false);
//		produto.setTipo_medicamento(false);
//		
//		System.out.println(produto.getId_produto());
//		System.out.println(produto.getNome_produto());
//		System.out.println(produto.getQtd_produto());
//		System.out.println(produto.isTipo_generico());
//		System.out.println(produto.isTipo_medicamento());
//		System.out.println(produto.getPreco());
		
		if(sintaxeBanco.estaConectado()) {
			// insercao
//			sintaxeBanco.InserirProdutos(produto);
			// edicao
			sintaxeBanco.ModificarProduto(produto);
			// Exclusao
//			sintaxeBanco.ExcluirProduto(produto);
			//Listagem
//			for(Produto p: sintaxeBanco.getProdutos()) {
//				System.out.println("\nID: " + p.getId_produto());
//				System.out.println("Produto: " + p.getNome_produto());
//				System.out.println("Quantidade: " + p.getQtd_produto());
//				System.out.println("Preco: " + p.getPreco());
//				System.out.println("Generico: " + p.isTipo_generico());
//				System.out.println("Medicamento: " + p.isTipo_medicamento());
//			}
			System.out.println("Exito");
		}else {
			System.out.println("Falha na operacao");
		}

	}

}
