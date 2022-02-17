package projetoDIOBanco;

import projetoDIOBanco.entities.Cliente;
import projetoDIOBanco.entities.Conta;
import projetoDIOBanco.entities.ContaCorrente;
import projetoDIOBanco.entities.ContaPoupanca;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(50, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		
		cc.sacar(48);

		System.out.println();

		poupanca.imprimirExtrato();

		System.out.println();
		cc.imprimirExtrato();

	}

}
