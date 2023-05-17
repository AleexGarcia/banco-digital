
public abstract class Conta {
	
	private static int AGENCIA_PADRAO = 4056;
	private int agencia;
	private int numero;
	private double saldo = 0;
	private Cliente cliente;
	
	private static int sequencial = 1;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = sequencial++;
		this.cliente = cliente;
	}
	
	public boolean sacar(double valor) {
		if(valor > 0 && this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	public boolean depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		if(this.sacar(valor)) {
			contaDestino.depositar(valor);
		}
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void imprimirExtrato() {
		System.out.println(String.format("Titular: %s\nN°: %d\nAgencia: %d\nSaldo: %.2f ",getCliente().nome, getNumero(),getAgencia(), getSaldo()));
	}

	
}
