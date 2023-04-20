package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayPrimitivo {
	
	//array[]

	public static void main(String[] args) {

		int[] idades = new int[5];
		
		for ( int i = 0; i< idades.length; i++) {
			idades[i] = i*i;
		}
		
		for ( int i = 0; i< idades.length; i++) {
			System.out.println(idades[i]);
		}
		

//		System.out.println("x");		//string
//		System.out.println("3");		//inteiro
//		System.out.println("false");	//boolean
		
		//aprendendo to String
		ContaCorrente cc = new ContaCorrente (22, 33);
		ContaPoupanca cp = new ContaPoupanca (33, 22);
		Cliente cliente = new Cliente ();
		
		System.out.println(cc.toString());
		System.out.println(cp.toString());
		
//		println(cc);
//		println(cliente);

	}
	
	//sobrecarga
	static void println () {}
	static void println ( int a) {}
	static void println ( boolean valor) {}
	static void println (Object referencia) {}
	
}
