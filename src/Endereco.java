
public class Endereco {
	private String cidade;
	private String logradouro;
	private int numero;
	private String bairro;
	private String cep;
	private Estados estado;
	
	public Endereco(String cidade, String logradouro, int numero, String bairro, String cep,Estados estado) {
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public void imprimirEndereco() {
		System.out.println(String.format("Endereco: %s, %d - %s, %s - %s, %s", logradouro,numero,bairro,cidade,estado.getSigla(),cep));
	}
	
	
	
	
}
