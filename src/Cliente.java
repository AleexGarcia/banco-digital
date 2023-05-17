
public class Cliente {
	private String nome;
	private long identidade;
	private String cpf;
	private Endereco endereco;
	
	public Cliente(String nome, long identidade,String cpf,Endereco endereco) {
		this.nome = nome;
		this.identidade = identidade;
		this.cpf = cpf;
		this.endereco = endereco;

	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getIdentidade() {
		return identidade;
	}
	public void setIdentidade(long identidade) {
		this.identidade = identidade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setEndereco(String cidade, String logradouro, int numero, String bairro, String cep) {
		endereco.setCidade(cidade);
		endereco.setLogradouro(logradouro);
		endereco.setNumero(numero);
		endereco.setBairro(bairro);
		endereco.setCep(cep);
	}
	public void imprimirDadosDoCliente() {
		System.out.println("-------------- Informações do cliente --------------");
		System.out.println("Nome: "+getNome());
		System.out.println("Identidade: "+getIdentidade());
		System.out.println("Cpf: "+getCpf());
		endereco.imprimirEndereco();
	}
	
	


	
}
