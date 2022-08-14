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
//			String query = "Select * from medicamentos where nome_medicamento like ' ";
//			this.resultset = this.statement.executeQuery(query);
//			this.statement = this.connection.createStatement();
//	}
	
	//Listagem
	public List<Produto> getProdutos(){
		List<Produto> produtos = new ArrayList<Produto>();
				
		try {
			String query = "Select * from medicamentos";
			this.resultset = this.statement.executeQuery(query);
			this.statement = this.connection.createStatement();
			while(this.resultset.next()) {
				Produto produto = new Produto();
				
				produto.setIdProduto(resultset.getInt("id_medicamento"));
				produto.setNomeProduto(resultset.getString("nome_medicamento"));
				produto.setQtdProduto(resultset.getInt("qtd_medicamento"));
				produto.setTipoGenerico(resultset.getBoolean("tipo_generico"));
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
			String query = "insert into medicamentos values (null,'"+ produto.getNomeProduto() +"'," + produto.getQtdProduto() +","+produto.isTipoGenerico()+", "+produto.getPreco()+");";
			System.out.println(query);
			this.statement.executeUpdate(query);
			
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	//Edicao
	public void ModificarProduto(Produto produto) {
		try {
			String query = "update medicamentos set nome_medicamento ='" + produto.getNomeProduto() + "', qtd_medicamento = '" + produto.getQtdProduto() + "', preco="+produto.getPreco()+"   where id_medicamento =" + produto.getIdProduto()+ ";";
			this.statement.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	//Exclusao
	public void ExcluirProduto (Produto produto) {
		try {
			String query = "delete from medicamentos where id_medicamento="+ produto.getIdProduto() +" ;";
			this.statement.executeUpdate(query);
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
	
		}
		
	}
	

}