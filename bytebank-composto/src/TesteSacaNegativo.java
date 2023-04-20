
public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		conta.saca(200);
		// argumento conta.saca(200) tbm pode ser utilizado com o sysoutcomo mostra abaixo
		
		System.out.println(conta.saca(101));
		
		conta.saca(101);
		
		System.out.println(conta.getSaldo());
		
	}

}
