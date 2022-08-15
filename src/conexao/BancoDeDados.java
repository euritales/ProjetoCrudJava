package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Produto;


public class BancoDeDados {
	
	private Connection connection=null;
	private java.sql.Statement statement=null;
	private ResultSet resultset=null;

	public void Conectar() {

		String servidor ="jdbc:mysql://localhost/projetoum";
		String usuario = "root";
		String senha = "mysql";
		String driver ="com.mysql.cj.jdbc.Driver";

		
		try {
			Class.forName(driver);

			this.connection=DriverManager.getConnection(servidor,usuario,senha);

			this.statement=this.connection.createStatement();
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}

	}
	
	public boolean estaConectado() {
		if(this.connection != null) {
			return true;
		}else {
			
			return false;
		}
	}
	
//	------------ CRUD PRODUTOS ------------

//	public String getProduto() { // Tentar criar um get Unitario
//		try {
//			String query = "Select * from produtos where nome_medicamento like ' ";
//			this.resultset = this.statement.executeQuery(query);
//			this.statement = this.connection.createStatement();
//	}
	
	//Listagem
	public List<Produto> getProdutos(){
		List<Produto> produtos = new ArrayList<Produto>();
				
		try {
			String query = "Select * from produto";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();
			while(this.resultset.next()) {
				Produto produto = new Produto();
				
				produto.setId_produto(resultset.getInt("id_produto"));
				produto.setNome_produto(resultset.getString("nome_produto"));
				produto.setQtd_produto(resultset.getInt("qtd_produto"));
				produto.setTipo_medicamento(resultset.getBoolean("tipo_medicamento"));
				produto.setTipo_generico(resultset.getBoolean("tipo_generico"));
				produto.setPreco(resultset.getDouble("preco"));
				produtos.add(produto);
			}
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}
		return produtos;
	}
	
	// insercao
	public void InserirProdutos(Produto produto) {
		try {
			String query = "insert into produto values (null, '"+ produto.getNome_produto() +"'," + produto.getQtd_produto() +","+produto.isTipo_generico() + "," + produto.isTipo_medicamento() +", "+produto.getPreco()+");";

			System.out.println(query);
			this.statement.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	//Edicao
	public void ModificarProduto(Produto produto) {
		try {
			String query = "update produto set nome_produto ='" + produto.getNome_produto() + "', qtd_produto = '" + produto.getQtd_produto() + "', preco="+produto.getPreco()+"   where id_produto =" + produto.getId_produto()+ ";";
			System.out.println(query);

			this.statement.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	//Exclusao
	public void ExcluirProduto (Produto produto) {
		try {
			String query = "delete from produto where id_produto="+ produto.getId_produto() +" ;";
			this.statement.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
	
		}
		
	}
	

	
	
	
	
	
}