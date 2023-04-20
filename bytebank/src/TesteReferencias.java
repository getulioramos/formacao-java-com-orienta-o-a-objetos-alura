
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("O saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("O saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("O saldo da segunda conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("são a mesmíssima conta");
		} else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	
	}

}
