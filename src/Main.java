
public class Main {
	public static void main(String[] args) {
		Cliente alex = new Cliente("Alexandre Augusto Garcia");
		Conta cc = new ContaCorrente(alex);
		Conta cp = new ContaPoupanca(alex);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
