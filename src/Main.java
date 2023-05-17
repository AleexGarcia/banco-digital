
public class Main {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Catalão", "R. Paulo de Tarso Vieira", 41, "Santa Helena", "75704-320", Estados.GOIAS);
		Cliente alex = new Cliente("Alexandre Augusto Garcia",9999999,"999.999.999-99",endereco);
		Conta cc = new ContaCorrente(alex);
		Conta cp = new ContaPoupanca(alex);
		cc.imprimirExtrato();
		cc.depositar(250);
		cc.imprimirExtrato();
		cc.transferir(120, cp);
		cp.imprimirExtrato();
		cc.imprimirDadosDoCliente();
		System.out.println("\n-------------Testes no objeto BANCO TESTE-----------\n");
		Banco bancoTeste = new Banco("Banco Teste");
		bancoTeste.addNovaConta(cp);
		bancoTeste.addNovaConta(cp);
		bancoTeste.addNovaConta(cc);
		System.out.println("Numero de contas cadastradas: "+ bancoTeste.numeroDeContasCadastrada());
		bancoTeste.removeConta(cc);
		System.out.println("Numero de contas cadastradas: "+bancoTeste.numeroDeContasCadastrada());
		bancoTeste.addNovaConta(cc);
		bancoTeste.imprimeClientesCadastrados();
		

	}
}
