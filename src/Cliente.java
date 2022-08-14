import java.util.HashMap;

public class Cliente {

	private String nome;
	private String dataNascimento;
	private String cpf;
    private String telefone;
	
	public Cliente(String nome, String dataNascimento,String cpf, String telefone) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.telefone = telefone;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void Cadastrar(String nome, String dataNascimento, String cpf, String telefone ) {
		// .add
	}
	public void Listar() {
		//.get
	}
	public void Editar() {
		//.set
	}
	public void Deletar() {
		//.remove
	}	
		
}
