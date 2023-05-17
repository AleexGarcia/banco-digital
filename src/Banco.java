import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void addNovaConta(Conta novaConta) {
		if(!contas.contains(novaConta)) {			
			contas.add(novaConta);
		}else {
			System.out.println("Conta ja cadastrada!");
		}
		
	}
	public void removeConta(Conta contaSelecionada) {
		contas.remove(contaSelecionada);
	}
	
	public int numeroDeContasCadastrada() {
		return contas.size();
	}
	
	public void imprimeClientesCadastrados() {
		if(!contas.isEmpty()) {	
			System.out.println("\n----------- Imprimindo dados dos clientes cadastrados ----------");
			Iterator<Conta> iterator = contas.iterator();
			while(iterator.hasNext()) {
				iterator.next().imprimirDadosDoCliente();
			}
		}
	}
}
