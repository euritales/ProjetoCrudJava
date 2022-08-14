package model;

public class Compra {
	private int clienteId;
	private int codigoCompra;
	private Double valorTotal;
//	private Date dataCompra;
	
	
	public int getClienteId() {
		return clienteId;
	}
	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}
	public int getCodigoCompra() {
		return codigoCompra;
	}
	public void setCodigoCompra(int codigoCompra) {
		this.codigoCompra = codigoCompra;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}
