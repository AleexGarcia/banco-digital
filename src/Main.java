
public class Main {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Catalão", "R. Paulo de Tarso Vieira", 41, "Santa Helena", "75704-320", Estados.GOIAS);
		Cliente alex = new Cliente("Alexandre Augusto Garcia",9999999,"999.999.999-99",endereco);
		Conta cc = new ContaCorrente(alex);
		Conta cp = new ContaPoupanca(alex);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		cc.getCliente().imprimirDadosDoCliente();
	}
}
