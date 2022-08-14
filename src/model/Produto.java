package model;

public class Produto {


	private int idProduto;
	private String nomeProduto;
	private int qtdProduto;
	private boolean tipoMedicamento;
	private boolean tipoGenerico;
	private Double preco;
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public boolean isTipoMedicamento() {
		return tipoMedicamento;
	}
	public void setTipoMedicamento(boolean tipoMedicamento) {
		this.tipoMedicamento = tipoMedicamento;
	}
	public boolean isTipoGenerico() {
		return tipoGenerico;
	}
	public void setTipoGenerico(boolean tipoGenerico) {
		this.tipoGenerico = tipoGenerico;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

    
	
}
